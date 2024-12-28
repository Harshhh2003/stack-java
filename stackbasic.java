import java.util.*;
public class stackbasic{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(10); // bottom 
        st.push(20);
        st.push(30);
        st.push(100);
        st.push(70); // pop 
        System.out.println("stack before removing any element   "  +  st);
        
        Stack<Integer> temp = new Stack<>();
        while(st.size()>3){
            temp.push(st.pop());
          
          
    
       
        }
 st.pop();
 while(temp.size()>0){
    st.push(temp.pop());
 }
 System.out.println("Final Stack after all operations: " + st);
    }
}