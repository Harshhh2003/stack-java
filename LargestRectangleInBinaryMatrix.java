import java.util.Stack;
public class LargestRectangleInBinaryMatrix {
    public static int maximalRectangle(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
  int maxArea = 0;
        int[] heights = new int[matrix[0].length];
 for (int i = 0; i < matrix.length; i++) {
       
            for (int j = 0; j < matrix[0].length; j++) {
                heights[j] = (matrix[i][j] == 1) ? heights[j] + 1 : 0;
            }
     maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
 return maxArea; }
 private static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int height = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * width);
            }
            stack.push(i);
        }

        return maxArea;
    } public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0} };
  System.out.println("Maximum Rectangle Area: " + maximalRectangle(matrix));
    }
}
