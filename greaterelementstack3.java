import java.util.Stack;

public class greaterelementstack3 {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 1, 8, 9};
        int[] copy = new int[a.length];
        Stack<Integer> st = new Stack<>();
        
        copy[0] = -1;
        st.push(a[0]);
        
        for (int i = 1; i < a.length; i++) {
            while (!st.isEmpty() && st.peek() <= a[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                copy[i] = -1;
            } else {
                copy[i] = st.peek();
            }
            st.push(a[i]);
        }
        
        for (int i : copy) {
            System.out.print(i + " ");
        }
    }
}
