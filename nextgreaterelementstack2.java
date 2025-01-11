import java.util.Stack;

public class nextgreaterelementstack2 {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2, 1, 6, 3, 4};
        int[] copy = new int[a.length];
        Stack<Integer> st = new Stack<>();
        
        copy[a.length - 1] = -1;
        st.push(a[a.length - 1]);
        
        for (int i = a.length - 2; i >= 0; i--) {
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
