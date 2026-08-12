class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int k=nums.length-1;
            int j=i+1;
            int temp=nums[i];
            if(i>0 && temp==nums[i-1]){
                    continue;
            }
            while(j<k){
            temp=nums[j];
            if((j>i+1)&&(temp==nums[j-1])){
                    j++;
                    continue;
            }
            if((i!=j)&&(j!=k)&&(i<j)&&(j<k)){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> inner=new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(nums[k]);
                    list.add(inner);
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else{
                    k--;
                }
            }
            else{
                break;
            }
            }
            
        }
        return list;
    }
}