class Solution {
    public String findPall(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        String ans = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String odd = findPall(s, i, i);
            if (odd.length() > ans.length()) {
                ans = odd;
            }
            String even = findPall(s, i, i + 1);
            if (even.length() > ans.length()) {
                ans = even;
            }
        }
        return ans;
    }
}
