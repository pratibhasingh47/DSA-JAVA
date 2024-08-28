package Week_5;

public class ExpressionEvaluation {
    // Method to evaluate the value of a postfix expression
    static int evaluatePostfix(String exp) {
        // Create a stack
        StackL<Integer> stack = new StackL<>();

        // Scan all characters one by one
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the scanned character is an operand (number here), push it to the stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');  // Convert char to int and push onto the stack
            }
            // If the scanned character is an operator, pop two elements from stack and apply the operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    default:
                        System.out.println("Unsupported operator encountered: " + c);
                        return Integer.MIN_VALUE; // Return a sentinel value to indicate error
                }
            }
        }
        return stack.pop();
    }

    // Driver program to test the above function
    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("Postfix evaluation: " + evaluatePostfix(exp));
    }
}
