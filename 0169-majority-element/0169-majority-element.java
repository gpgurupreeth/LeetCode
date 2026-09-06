class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int i=0;i<nums.length;i++){
            int count=0;
            if(map.containsKey(nums[i])){
                count=map.get(nums[i]);
                count++;
                map.put(nums[i],count);
                if(count>n/2){
                    return nums[i];
                }
            }
            else{
                map.put(nums[i],1);
            }
          }
        return -1;
    }
}
