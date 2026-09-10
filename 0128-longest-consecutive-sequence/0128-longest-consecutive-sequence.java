class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> tree=new TreeSet<>();
        for(int i:nums){
            tree.add(i);
        }
        Integer prev=null;
        int count=0;
        int max_count=0;
        for(int num:tree){
            if(prev!=null && num==prev+1){
                count++;
            }
            else{
                count=1;
            }
            max_count=Math.max(max_count,count);
            prev=num;
        }
        return max_count;
    }
}