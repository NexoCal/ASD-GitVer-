
import java.util.Scanner;

public class StudyKasusStack1 {
    public static void main(String[] args) {
        StackArray <Integer> Binary = new StackArray<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Bilangan Dalam Desimal:");
        int num = in.nextInt();
        int original = num;

        while (num > 1){
            int temp = num%2;
            num = num/2;
            Binary.push(temp);
            if (num == 1){
                Binary.push(1);
            }
            if (num == 0){
                Binary.push(0);
            }
        }
        int size = Binary.size();
        System.out.print("Hasil Konversi Bilangan Desimal " + original +" Ke Bilangan Biner Adalah: ");
        for (int i = 0;i < size; i++){
            System.out.print(Binary.peek());
            System.out.print("");
            Binary.pop();
        }
    }
}
