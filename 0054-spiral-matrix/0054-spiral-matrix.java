class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right && top <= bottom) {

            // Top
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Right
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Bottom
            for (int i = right; i >= left; i--) {
                if (top > bottom) {
                    break;
                }
                ans.add(matrix[bottom][i]);
            }
            bottom--;

            // Left
            for (int i = bottom; i >= top; i--) {
                if (left > right) {
                    break;
                }
                ans.add(matrix[i][left]);
            }
            left++;
        }

        return ans;
    }
}