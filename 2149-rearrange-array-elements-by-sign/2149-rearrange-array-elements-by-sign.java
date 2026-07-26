class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] res=new int[nums.length];
       int positive=0;
       int negative=1;
       for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[positive]=nums[i];
                positive=positive+2;
            }
            else{
                res[negative]=nums[i];
                negative=negative+2;
            }
       }
       return res;
    }
}