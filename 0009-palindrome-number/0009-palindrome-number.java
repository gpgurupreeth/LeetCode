class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int reverse=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int dig=x%10;
            reverse=reverse*10+dig;
            x=x/10;
        }
        if(reverse==temp){
            return true;
        }
        return false;
    }
}