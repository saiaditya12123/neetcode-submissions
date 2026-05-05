class Solution {
    public boolean checkInclusion(String s1, String s2) {
           int[] s1Count=new int[26];
        for(int i=0;i<=s1.length()-1;i++){
            s1Count[s1.charAt(i)-'a']++;
        }
        String s1str=Arrays.toString(s1Count);

        for(int j=0;j<=s2.length()-1;j++){
            int[] swcount=new int[26];
            for(int k=j;k<=Math.min((j+s1.length()-1), s2.length()-1);k++){
                swcount[s2.charAt(k)-'a']++;
            }
            String swstr=Arrays.toString(swcount);
            if (s1str.equals(swstr)) {
                return true;
                
            }
        }
        return false;
    }
}
