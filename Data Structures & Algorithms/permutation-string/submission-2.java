class Solution {
    public boolean checkInclusion(String s1, String s2) {
                int[] s1freq=new int[26];
        for(int i=0;i<=s1.length()-1;i++){
            s1freq[s1.charAt(i)-'a']++;
        }
        int left=0;
        int right=0;
        int[] charFreqWin=new int[26];
        while (right<=s2.length()-1){
            ++charFreqWin[s2.charAt(right)-'a'];
            if(right-left+1==s1.length()){
                if(Arrays.toString(s1freq).equals(Arrays.toString(charFreqWin))){
                    return true;
                }
                charFreqWin[s2.charAt(left)-'a']--;
                left++;

            }
            right++;
        }
        return false;
    }
}
