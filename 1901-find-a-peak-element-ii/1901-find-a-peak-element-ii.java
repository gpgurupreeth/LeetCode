class Solution {

    public int[] findPeakGrid(int[][] mat) {

        int left = 0;
        int right = mat[0].length - 1;

        while (left <= right) {

            int midCol = left + (right - left) / 2;

            // Find maximum element in this column
            int maxRow = 0;

            for (int i = 1; i < mat.length; i++) {

                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            int leftValue = (midCol > 0)?mat[maxRow][midCol - 1]: -1;

            int rightValue = (midCol < mat[0].length - 1)? mat[maxRow][midCol + 1]: -1;

            // Peak found
            if (mat[maxRow][midCol] > leftValue &&
                mat[maxRow][midCol] > rightValue) {

                return new int[]{maxRow, midCol};
            }

            // Move left
            if (leftValue > mat[maxRow][midCol]) {
                right = midCol - 1;
            }

            // Move right
            else {
                left = midCol + 1;
            }
        }

        return new int[]{-1, -1};
    }
}