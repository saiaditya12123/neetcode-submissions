class Solution {
    public int characterReplacement(String s, int k) {
                int left=0;
        int right=0;
        int[] freq=new int[26];
        int maxFreq=0;
        while (right<=s.length()-1){
            int x=++freq[s.charAt(right)-'A'];
            maxFreq=Math.max(maxFreq,x);
            while (((right-left+1)-maxFreq)>k){
                freq[s.charAt(left)-'A']--;
                left++;

            }
            right++;
        }
        return s.length()-left;
    }
}
