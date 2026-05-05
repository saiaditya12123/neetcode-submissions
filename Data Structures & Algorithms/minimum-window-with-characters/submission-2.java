class Solution {
    public String minWindow(String s, String t) {
                int[] tfreq=new int[128];
        int k=-1;
        int minWind=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int count=0;
        StringBuilder result=new StringBuilder("");
        int[] windowFreq=new int[128];
        for(int i=0;i<=t.length()-1;i++){
            tfreq[t.charAt(i)-'A']++;
        }
        while (right<=s.length()-1){
            ++windowFreq[s.charAt(right)-'A'];
            if(tfreq[s.charAt(right)-'A']>=windowFreq[s.charAt(right)-'A']){
                count++;
            }


                while (count==t.length()){
                    if(right-left+1<minWind){
                        minWind=right-left+1;
                        k=left;
                    }

                    if(tfreq[s.charAt(left)-'A']>=windowFreq[s.charAt(left)-'A']){
                        count--;
                    }
                    windowFreq[s.charAt(left)-'A']--;
                    left++;
                }


            right++;



        }
        if(k>=0){
            return s.substring(k,minWind+k);
        }
       return "";
    }
}
