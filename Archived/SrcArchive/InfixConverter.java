
public class InfixConverter {
    /*
     * This is class/program convert infix operation
     * into postfix operation, which later can be use
     * in StudyKasusStack2.java
     */
    public static int OperationHierarchy(String x) {
        switch (x){
            case "+":
                return 1;
            case "-":
                return 1;
            case "*":
                return 2;
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }

    public static String Convert(String x){
        String result = "";
        StackArray <Character> OperatorStack = new StackArray<>();
        
        for (int i = 0; i < x.length(); i++){
            String temp = x.substring(i, (i+1));
            String peek = "" + OperatorStack.peek();
            if (OperatorStack.isOperator(temp)){
                while(!OperatorStack.empty() && OperationHierarchy(temp) <= OperationHierarchy(peek)){
                    result = result + peek;
                    OperatorStack.pop();
                    peek = "" + OperatorStack.peek();
                }
                char Chartemp = temp.charAt(0);
                OperatorStack.push(Chartemp);

            }else{
                result = result + temp;
            }
        }

        while (!OperatorStack.empty()) {
            String peek = "" + OperatorStack.peek();
            result = result + peek;
            OperatorStack.pop();
        }


        return result;
    }

    public static void main(String[] args) {
        String x = Convert("5*9+6^3-6+2");
        System.out.println(x);
    }
}
