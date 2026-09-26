class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int lowRow = 0;
        int highRow = matrix.length - 1;
        while (lowRow <= highRow) {
            int mid = lowRow + (highRow - lowRow) / 2;
            if (matrix[mid][0] <= target) {
                lowRow = mid + 1;
            } 
            else {
                highRow = mid - 1;
            }
        }
        if (highRow < 0) {
            return false;
        }
        int row = highRow;
        int low = 0;
        int high = matrix[row].length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } 
            else if (matrix[row][mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}