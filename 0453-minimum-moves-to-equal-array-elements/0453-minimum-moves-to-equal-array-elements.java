import java.util.Arrays;

class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            count =count+(nums[i] - start);
        }
        return count;
    }
}