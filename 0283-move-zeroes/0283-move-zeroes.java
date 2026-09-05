class Solution {
    public void moveZeroes(int[] nums) {
        int cur=0;
        if(nums.length==1){
            return;
        }
        for(int trav=0;trav<nums.length;trav++){
            if(nums[trav]!=0){
                int temp=nums[cur];
                nums[cur]=nums[trav];
                nums[trav]=temp;
                cur++;
            }
        }
    }
}