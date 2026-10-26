import java.util.TreeMap;

class Solution {
    public int beautySum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            TreeMap<Character, Integer> map = new TreeMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int freq : map.values()) {
                    maxFreq = Math.max(maxFreq, freq);
                    minFreq = Math.min(minFreq, freq);
                }

                sum += maxFreq - minFreq;
            }
        }

        return sum;
    }
}