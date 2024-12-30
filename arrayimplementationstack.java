public class arrayimplementationstack {
    public static class Stack {
        int[] arr = new int[10];
        private int idx = 0;
void push(int x) {
            if (idx >= arr.length) {
                return;
            }
            arr[idx] = x;
            idx++;
        }
 
        int peek() {
            if (idx <= 0) {
                return -1;  }
            return arr[idx - 1];
        }
   int pop() {
            if (idx <= 0) {
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }
  void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
   int size() {
            return idx;
     }  }
  public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(10);
        st.push(23);
        st.display(); 

        System.out.println(st.size());
        st.pop();
        st.display();
    }
}
