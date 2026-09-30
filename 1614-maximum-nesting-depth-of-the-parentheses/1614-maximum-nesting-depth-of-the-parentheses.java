class Solution {
    public int maxDepth(String s) {
        int maxCount=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                count--;
            }
            else{
                continue;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}