import java.util.Stack;

public class nextsmallestelementstack{
    public static void main(String[] args) {
        int [] a = {  2 , 3, 4, 5, 10 , 11 , 4};
        int  [] copy = new int[a.length];
   Stack<Integer> st = new Stack<>();
  for(int  i = a.length-1; i>=0; i--){
    while(!st.empty() && st.peek()>=a[i]){
        st.pop();

    } if(st.isEmpty()){
        copy[i] = -1;
    } else{
        copy[i] = st.peek();
    }
st.push(a[i]);

  }
        for(int  i  :  copy){
            System.out.println(i   +    "      ");
        }

        
    }

}