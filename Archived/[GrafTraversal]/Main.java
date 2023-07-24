class ConnectedComponents {
    public static void main(String[] args) {
        Graph mygraph = new Graph(6);
        mygraph.addEdge(0, 1);
        mygraph.addEdge(1, 2);
        mygraph.addEdge(4, 3 );
        mygraph.addEdge(4, 5 );
        
        
        System.out.println("Connected Components = "+mygraph.countConnection());
        mygraph.draw();

    }    

}


class ShortestPath {
    public static void main(String[] args) {
        Graph mygraph = new Graph(6);
        mygraph.addEdge(0, 1);
        mygraph.addEdge(1, 2);
        mygraph.addEdge(4, 0);
        mygraph.addEdge(4, 2);
        mygraph.addEdge(4, 3);
        mygraph.addEdge(0, 3);
        mygraph.addEdge(5, 3);
        
        int Start = 2;
        int Finish = 5; 

        System.out.println("Jarak terdekat dari " + Integer.toString(Start)+ " ke " + Integer.toString(Finish) + " = " + mygraph.getDistance(Start, Finish));
        System.out.println("");
        mygraph.draw();
    }    

}
