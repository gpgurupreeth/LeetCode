class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        int i=0;
        int firstOccurence=-1;
        int start=i;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==needle.length()-1){
                    return start;
                }
                i++;
                j++;
            }
            else{
                i=start+1;
                start=i;
                j=0;
            }
        }
        return firstOccurence;
    }
}
