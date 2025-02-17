import java.util.*;
public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "9+(5+3)*4/6";  
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
  for (int i = infix.length() - 1; i >= 0; i--) {  
            char ch = infix.charAt(i);
            int ascii = (int) ch;
  if (ascii >= 48 && ascii <= 57) {  
                val.push("" + ch);
            } else if (op.isEmpty() || ch == ')' || op.peek() == ')') { 
                op.push(ch);   } else if (ch == '(') {  
                while (op.peek() != ')') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;  
                    val.push(t);
                }
                op.pop();      } else {  
                while (!op.isEmpty() && precedence(op.peek()) > precedence(ch)) {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }      }
        } while (!op.isEmpty()) {
            String v1 = val.pop();
            String v2 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }

      System.out.println("Prefix Expression: " + val.pop());
    }
 private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }
}
