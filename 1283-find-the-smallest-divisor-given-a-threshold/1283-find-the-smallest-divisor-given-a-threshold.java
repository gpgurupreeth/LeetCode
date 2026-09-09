class Solution {
    public boolean checkResult(int[] nums,int number,int mid){
        int result=0;
        for(int i=0;i<nums.length;i++){
            // result=result+(int)Math.ceil((double)nums[i]/mid);
            result += (nums[i] + mid - 1) / mid;
        }
        if(result<=number){
            return true;
        }
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=nums[0];
        for(int i=1;i<nums.length;i++){
            high=Math.max(nums[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(checkResult(nums,threshold,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}