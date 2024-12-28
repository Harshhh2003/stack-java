import java.util.*;
public class removestack{
    public static void main(String[] args) {
        Stack<Integer>  st = new Stack<>();
        st.push(10); // bottom // 0 idx
        st.push(20);//1 idx
        st.push(30); // 3 idx
        st.push(40); // 4 idx
        st.push(50); // top element // 5 idx
        System.out.println("original stack     :    "  +   st);
        Stack<Integer>  temp = new Stack<>();
        while(st.size()>3){
            temp.push(st.pop());

        } st.pop();
       while(temp.size()>0){
        st.push(temp.pop());
       }
System.out.println(" new stack after removing the element  :   "    +  st);
               }
        
    }
