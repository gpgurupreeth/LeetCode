class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1;
                int k=nums.length-1;
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                while(l<k){
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[k];
                    if(sum==target){
                        List<Integer> inner=new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[k]);
                        inner.add(nums[l]);
                        list.add(inner);
                        l++;
                        k--;

                        while (l < k && nums[l] == nums[l - 1]) {
                            l++;
                        }

                        while (l < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    }
                    else if(nums[i]+nums[j]+nums[k]+nums[l]<target){
                        l++;
                    }
                    else{
                        k--;
                    }
                }

            }
           
        }
        return list;
    }
}