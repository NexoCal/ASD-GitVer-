import java.util.ArrayList;

public class Graph {

    /*
     * Instead of using standard array, this code use ArrayList
     * Instead of using Static Queue, this code use Dynamic Queue
     * 
     * A bit over-kill and unnecessary complexity even increasing the time to run, but i like to challange myself
     * and it works
     * 
     */
    private ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
    private ArrayList<Boolean> visited = new ArrayList<Boolean>();
    private ArrayList<Integer> distance = new ArrayList<Integer>();
    private Queue<Integer> queue = new Queue<Integer>();

    public Graph(int N) {
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<Edge>());
            visited.add(i, false);
            distance.add(i,1000000000);
        }
    }

    // method utama addEdge
    public void addEdge(int source, int dest, int weight, boolean directed) {
        ArrayList<Edge> adjU = (ArrayList<Edge>) adj.get(source);
        adjU.add(new Edge(dest, weight));
        if (directed == false) {
            ArrayList<Edge> adjV = (ArrayList<Edge>) adj.get(dest);
            adjV.add(new Edge(source, weight));
        }
    }

    // untuk unweighted directed graph
    public void addEdge(int source, int destination, boolean directed) {
        this.addEdge(source, destination, 1, directed);
    }

    // untuk unweighted graph
    public void addEdge(int source, int destination) {
        this.addEdge(source, destination, 1, false);
    }

    public void draw() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " : ");
            ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(i);
            for (int j = 0; j < adjacent.size(); j++) {
                Edge v = (Edge) adjacent.get(j);
                System.out.print("(" + v.dest + ", " + v.weight + ") ");
            }
            System.out.println("");
        }
    }

    private void clearVisited() {
        for (int i = 0; i < visited.size(); i++) {
            visited.set(i, false);
        }
    }

    private void clearDistance() {
        for (int i = 0; i < distance.size(); i++) {
            distance.set(i,1000000000);
        }
    }

    private void dfs(int nodeIDx) {
        visited.set(nodeIDx, true);
        ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(nodeIDx);
        for (int i = 0; i < adjacent.size(); i++) {
            int dest = ((Edge) adjacent.get(i)).getdest();
            if (visited.get(dest) == false) {
                dfs(dest);
            }
        }
    }

    public int countConnection() {
        clearVisited();
        int counter = 0;
        for (int i = 0; i < adj.size(); i++) {
            if (visited.get(i) == false) {
                counter++;
                dfs(i);
            }
        }
        return counter;
    }

    private void bfs(int nodeIDx) {
        queue.clear();
        queue.enqueue(nodeIDx);
        while (queue.isEmpty() == false) {
            int nodeNow = (int) queue.dequeue();
            visited.set(nodeNow, true);
            ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(nodeNow);
            for (int i = 0; i < adjacent.size(); i++) {
                int dest = ((Edge) adjacent.get(i)).getdest();
                if (visited.get(dest) == false) {
                    queue.enqueue(dest);
                }
            }
        }
    }

    public int getDistance(int Start, int Finish){
        clearDistance();
        distance.set(Start,0);
        queue.clear();
        queue.enqueue(Start);
        while (queue.isEmpty() == false) {
            int nodeNow = (int) queue.dequeue();
            visited.set(nodeNow, true);
            if(nodeNow == Finish){
                return distance.get(nodeNow);
            }
            ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(nodeNow);
            for (int i = 0; i < adjacent.size(); i++) {
                int dest = ((Edge) adjacent.get(i)).getdest();
                if (visited.get(dest) == false) {
                    distance.set(dest, Math.min(distance.get(dest), distance.get(nodeNow)+1));
                    queue.enqueue(dest);
                }
                
            }
        }
        return -1;
    }

}
