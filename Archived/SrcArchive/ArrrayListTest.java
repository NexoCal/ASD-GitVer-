
public class ArrrayListTest {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        System.out.println("Current size: " + test.size());
        System.out.println("Is the Array List empty? : " +
                test.isEmpty());
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");
        test.add("g");
        test.add(2, "x");
        test.add(5, "e");
        test.add(6, "f");
        test.add("h");
        test.add("i");
        test.add("j");
        test.add("k");
    
        test.remove("x");
        
        test.remove(10);         

        test.showArray();

        System.out.println("\nCurrent size: " + test.size());
        System.out.println("Is the Array List empty? : " +
                test.isEmpty());
        System.out.println("\nClearing the ArrayList...");
        test.clear();
        System.out.println("\nCurrent size: " + test.size());
        System.out.println("Is the Array List empty? : " + test.isEmpty());
    }
}
