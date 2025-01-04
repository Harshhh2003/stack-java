import java.util.*;public class ConsecutiveElementRemoval {
    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> str = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (str.size() == 0 || str.peek() != arr[i]) {
                str.push(arr[i]);
            }
            else if (i == n - 1 || arr[i] != arr[i + 1]) {
                str.pop();
            }   }

        int result[] = new int[str.size()];
        int h = result.length;
        for (int j = h - 1; j >= 0; j--) {
            result[j] = str.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7};
        int[] result = remove(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + "   ");
        }
    }
}
