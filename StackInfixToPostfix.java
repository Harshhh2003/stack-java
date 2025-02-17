import java.util.*;
public class StackInfixToPostfix {
    public static void main(String[] args) {
        String str = "a+b*c-d";
        Stack<Character> op = new Stack<>();
        StringBuilder postfix = new StringBuilder();
  for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    postfix.append(op.pop());      }
                op.push(ch);
            }    } while (!op.isEmpty()) {
            postfix.append(op.pop());   }

        System.out.println(postfix);
    }static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }
}
