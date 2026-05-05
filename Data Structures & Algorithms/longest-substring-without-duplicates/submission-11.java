class Solution {
    public int lengthOfLongestSubstring(String s) {
                Set<Character> hashset=new HashSet<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while (right<=s.length()-1){

            while (hashset.contains(s.charAt(right))){
                hashset.remove(s.charAt(left));
                left++;
            }
            hashset.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
            right++;


        }
        return  maxlen;
    }
}
