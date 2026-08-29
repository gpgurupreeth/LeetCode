class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
                int res=Math.min(nums[low],min);
                min=res;
                low=mid+1;
            }
            else{
                if(nums[mid]<=nums[high]){
                    int res=Math.min(nums[mid],min);
                    min=res;
                    high=mid-1;
                }
            }
        }
        return min;
    }
}