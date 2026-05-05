class Solution {
    public boolean isAnagram(String s, String t) {
       int[] charCount=new int[26];
       for(int i=0;i<=s.length()-1;i++){
        charCount[s.charAt(i)-'a']++;
       }
       for(int j=0;j<=t.length()-1;j++){
        charCount[t.charAt(j)-'a']--;
       }
       for(int k=0;k<=charCount.length-1;k++){
        if(charCount[k]!=0){
            return false;
        }
       }
       return true;
    }
}
