class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            sum=sum+nums[i];
        }
        return nums.length*max-sum;
    }
}