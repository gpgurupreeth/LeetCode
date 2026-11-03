class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(max,nums[i]);
        }
        return nums.length*max-sum;
    }
}