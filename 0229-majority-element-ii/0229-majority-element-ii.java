class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(map.containsKey(nums[i])){
                continue;
            }
            for(int j=i;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
            else{
                break;
            }
        }
        map.put(nums[i],count);
        }
        int max=nums.length/3;
        List<Integer> list=new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > max) {
                list.add(key);
            }
        }
    return list;
    }
}