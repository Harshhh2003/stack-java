import java.util.Stack;
public class pushatanyindex{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
       
     
        st.push(1);
        st.push(10);
        st.push(23);
        st.push(100);
        st.push(29
        ); System.out.println(st);
        int idx = 3;
        int x = 50;
        Stack<Integer>  temp = new Stack<>();
       
   while(st.size()> idx){
    // idx tak ka data temp stack mein daal diya
    temp.push(st.pop()); 

   } st.push(x); // added 50 at the required index

   while (temp.size()>0) {
         // temp ke sare elements wapas st mein daala
    st.push(temp.pop());
    
   }
System.out.println( " new stack is  :  "   +   st);
        
    }
}