class Solution {
    public int lengthOfLongestSubstring(String s) {
                Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            // Remove characters until 'current' is not in the set
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            // Update maxLength. Note: right - left + 1 is the current window size.
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
