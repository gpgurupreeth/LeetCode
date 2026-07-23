class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int max_count=1;
        Arrays.sort(nums);
        if(nums.length>=1){
            count=1;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i+1]-nums[i]==1){
                    count++;
                    if(count>max_count){
                        max_count=count;
                    }
                }
                else if(nums[i+1]==nums[i]){
                    continue;
                }
                else{
                    count=1;
                }
            }
            return max_count;
        }
        return count;
    }
}