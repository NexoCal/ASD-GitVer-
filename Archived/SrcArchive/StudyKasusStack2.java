
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyKasusStack2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StackArray<String> Operation = new StackArray<>();
        System.out.println("Infix format? (1:YES/0:NO)");
        String choice = in.nextLine();

        String Question = "";

        while (true) {
            if (choice.equals("1")) {
                System.out.println("Infix Equation:");
                String infix = in.nextLine();
                Question = InfixConverter.Convert(infix);
                System.out.println("Postfix Equation: "+Question);
                break;
            } else if (choice.equals("0")) {
                System.out.println("Postfix Equation:");
                Question = in.nextLine();
                break;
            } else {
                System.out.println("Not In Choice! Try Again!");
                choice = in.nextLine();
            }
        }
        boolean ShowResult = true;

        for (int i = 0; i < Question.length(); i++) {
            String temp = Question.substring(i, (i + 1));

            if (Operation.isOperator(temp) == true) {
                double B = Double.valueOf((String) Operation.peek());
                Operation.pop();
                double A = Double.valueOf((String) Operation.peek());
                Operation.pop();
                double C = Operation.operation(A, B, temp);
                String result = "" + C;
                Operation.push(result);
            } else {
                Operation.push(temp);
            }

        }
        if (Operation.size() > 1){
            ShowResult = false;
        }
        if (ShowResult == true) {
            System.out.println("Hasil PostFix Calculation: " + Operation.peek());
        }else{
            System.out.println("Invalid Postfix Equation!!");
        }
    }
}
