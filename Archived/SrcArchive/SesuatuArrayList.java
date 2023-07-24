

public class SesuatuArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++ ){
            arr1.add(i);
            arr1.showArray();
        }

        arr1.remove(Integer.valueOf(3));
        arr1.showArray();

        arr1.add(2,7);
        arr1.add(8);
        arr1.add(9);

        arr1.showArray();

        arr1.clear();
        arr1.showArray();
    }
}
