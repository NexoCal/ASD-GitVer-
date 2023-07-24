

public class BinarySearch {

    static int pivotpoint(int [] x, int a, int b){
        int pivot = x[b];
        int i = a - 1;
        for (int j = a; j <= b; j++){
            if (x[j] < pivot){
                i++;
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            } 
        }
        int temp = x[i+1];
        x[i+1] = x[b];
        x[b] = temp;
        return i+1;
    }
    public static void quicksorting(int [] x, int a, int b){
        if (a < b){
            int part = pivotpoint(x, a, b);
            quicksorting(x, a, part - 1);
            quicksorting(x, part + 1, b);
        }
    }

    static void showArray(int [] x){
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int [] Items = new int[20];

        for (int i = 0; i<Items.length;i++){
            int j = (int)(Math.random()*100);
            Items[i] = j;
        }
        showArray(Items);
        quicksorting(Items, 0, Items.length-1);
        showArray(Items);

        





    }
}
