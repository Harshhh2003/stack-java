import java.util.*;
public class displaystackrecursively{
    public static void displayrecursive(Stack<Integer> st){
        if(st.size()==0) return; // base case
        int top = st.pop();
    System.out.print(top  +   "  " );
    displayrecursive(st);
st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        displayrecursive(st);
        
    }
}