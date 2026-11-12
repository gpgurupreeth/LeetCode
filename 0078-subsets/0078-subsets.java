class Solution {
    public static void generate(int[] nums,List<List<Integer>> list,int i,List<Integer> innerList){
        if(i==nums.length){
            list.add(new ArrayList<>(innerList));
            return;
        }
        innerList.add(nums[i]);
        generate(nums,list,i+1,innerList);
        innerList.remove(Integer.valueOf(nums[i]));
        generate(nums,list,i+1,innerList);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int i=0;
        List<Integer> innerList=new ArrayList<>();
        generate(nums,list,i,innerList);
        return list;
    }
}