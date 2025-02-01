import java.util.*;
public class infixstack {public static void main(String[] args) {
        String str = "10-6+12*4/8";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
 for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
  if (Character.isDigit(ch)) {
                val.push(ch - '0');
            }  else if (op.isEmpty() || precedence(op.peek()) < precedence(ch)) {
                op.push(ch);
            } 
            else {      while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    
                    if (operator == '+') val.push(v1 + v2);
                    if (operator == '-') val.push(v1 - v2);
                    if (operator == '*') val.push(v1 * v2);
                    if (operator == '/') val.push(v1 / v2);     }
                op.push(ch);  }
        }   while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();
               if (operator == '+') val.push(v1 + v2);
            if (operator == '-') val.push(v1 - v2);
            if (operator == '*') val.push(v1 * v2);
            if (operator == '/') val.push(v1 / v2);
        }   System.out.println(val.pop());
    } static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;}}
