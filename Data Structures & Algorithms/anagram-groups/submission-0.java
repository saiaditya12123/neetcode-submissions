class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String,List<String>> hashMap=new HashMap<>();
        List<List<String>> result=new ArrayList<>();

        for(int i=0;i<=strs.length-1;i++){
            int[] chrCnt=new int[26];
            for(int j=0;j<=strs[i].length()-1;j++){

                chrCnt[strs[i].charAt(j)-'a']++;

            }

            String countStr=Arrays.toString(chrCnt);
            if(hashMap.containsKey(countStr)){
                List<String> newList=hashMap.get(countStr);
                newList.add(strs[i]);
                hashMap.put(countStr,newList);
            }else{
                List<String> anagramList=new ArrayList<>();
                anagramList.add(strs[i]);
                hashMap.put(countStr, anagramList);
            }
        }
        
        for(List<String> value:hashMap.values()){
          result.add(value);

        }

   
        return result;
    }
}
