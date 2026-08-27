class Solution {
    public int removeDuplicates(int[] nums) {
        int cur=0;
        int count=1;
        for(int trav=0;trav<nums.length;trav++){
            if(nums[cur]!=nums[trav]){
                cur++;
                count++;
                nums[cur]=nums[trav];
            }

        }
        return count++;
    }
}