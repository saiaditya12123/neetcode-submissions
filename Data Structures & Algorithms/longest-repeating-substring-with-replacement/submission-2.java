class Solution {
    public int characterReplacement(String s, int k) {
               int[] count=new int[26];
        int maxFreq=0;
        int result=0;
        int left=0;
        int right=0;
        while (right<=s.length()-1) {
            count[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq, count[s.charAt(right)-'A']);
            while ((right-left+1)-maxFreq>k) {
                count[s.charAt(left)-'A']--;
                left++;
                
            }
            result=Math.max(result, right-left+1);
            right++;
        }
      return result;
    }
}
