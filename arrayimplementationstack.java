

public class arrayimplementationstack {
    public static class Stack {
        int[] arr = new int[10];
        private int idx = 0;

        // Push an element onto the stack
        void push(int x) {
            if (idx >= arr.length) {
                return;  // Stack is full, no action is taken
            }
            arr[idx] = x;  // Add element at the current index
            idx++;  // Move to the next index
        }

        // Peek at the top element of the stack
        int peek() {
            if (idx <= 0) {
                return -1;  // Stack is empty, return -1
            }
            return arr[idx - 1];  // Return the top element
        }

        // Pop the top element from the stack
        int pop() {
            if (idx <= 0) {
                return -1;  // Stack is empty, return -1
            }
            int top = arr[idx - 1];  // Get the top element
            arr[idx - 1] = 0;  // Reset the value to 0 (optional)
            idx--;  // Decrement the index
            return top;  // Return the popped element
        }

        // Display the stack elements
        void display() {
            for (int i = 0; i < idx; i++) {  // Loop from 0 to idx to print all elements
                System.out.print(arr[i] + " ");  // Print the current element
            }
            System.out.println();  // Newline after printing the stack
        }

        // Get the current size of the stack
        int size() {
            return idx;  // Return the number of elements in the stack
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();  // Create a stack instance
        st.push(4);  // Push 4 onto the stack
        st.push(10);  // Push 10 onto the stack
        st.push(23);  // Push 23 onto the stack
        st.display();  // Display the stack (Expected: 4 10 23)

        System.out.println(st.size());  // Display the size of the stack (Expected: 3)
        st.pop();  // Pop the top element (Expected: 23)
        st.display();  // Display the stack after pop (Expected: 4 1
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
                return -1;  }
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
