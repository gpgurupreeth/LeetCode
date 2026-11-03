class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int last=nums[nums.length-1];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(last-nums[i]);
        }
        return sum;
    }
}