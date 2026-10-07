class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int digit = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } 
        else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }
        while (i < s.length() &&
               s.charAt(i) >= '0' &&
               s.charAt(i) <= '9') {
            int number = s.charAt(i) - '0';
            if (digit > (Integer.MAX_VALUE - number) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            digit = digit * 10 + number;
            i++;
        }
        return digit * sign;
    }
}