import java.util.Stack;
public class basicstatic{
    public static void main(String[] args) {

        
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty()); // true o/p
        System.out.println("size is   :    "  +   st.size()); // empty stack o/p will be 0;
        st.push(1);
        st.push(10);
        st.push(23);
        st.push(100); // push is used to add elements in a  stack
        System.out.println(st);
        System.out.println(st.peek());// peek is used to check the top most element in a non empty stack
        System.out.println(st.isEmpty());  // false stack is not empty
        System.out.println(st.pop()); // pop is used to remove the top element of the stack in this eg we removed 100 .
        System.out.println( " size of stack is   :  "     +  st.size());
        while(st.size()>1){
            st.pop();
            System.out.println(st); // o/p = 1
        } }
} 