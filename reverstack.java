import java.util.Stack;
public class reversestack{
    public static void main(String[] args) {
        Stack<Integer>  st= new Stack();
    
        st.push(20);
        st.push(100);
        st.push(50);
        st.push(10);

        Stack<Integer>    hr = new Stack();
        System.out.println("Original stack: " + st);
        while(st.size() >0){
            int x = st.peek();
            hr.push(x);
        st.pop();
        }
     
System.out.println( " reversed stack is    :   "  +   hr);
        
    }
}