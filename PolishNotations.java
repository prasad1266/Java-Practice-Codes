import java.util.Stack;

public class PolishNotations {

    public int evalPrn(String[] tokens) {
        int returnValue = 0;
        String Operators = "+-*/";

        Stack<String> stack = new Stack<String>();
        for (String t : tokens) {

            if (!Operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = Operators.indexOf(t);

                switch (index) {
                    case 0:
                        stack.push(String.valueOf(b + a));
                        break;
                    case 1:
                        stack.push(String.valueOf(b - a));
                        break;
                    case 2:
                        stack.push(String.valueOf(b * a));
                        break;
                    case 3:
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }

        }

        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }

    public static void main(String[] args) {
        PolishNotations obj = new PolishNotations();
        String[] tokens = { "2", "1", "+", "3", "*" };
        int result = obj.evalPrn(tokens);
        System.out.println(result);
    }
}