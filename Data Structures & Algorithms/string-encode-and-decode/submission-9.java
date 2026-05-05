class Solution {
    public static String encode(List<String> strs) {
        StringBuilder encodedStr=new StringBuilder();

        for(String s:strs){
           
            encodedStr.append(s);
            encodedStr.append("#"+s.length()+"#");            
        }
        
        return encodedStr.toString();

    }

    public static List<String> decode(String str) {

        List<String> decodedList=new ArrayList<>();
        String[] splitStr=str.split("(#[0-9]{1,}#)");

        if(str.isEmpty()){
            return decodedList;
        }else if(splitStr.length==0){
            decodedList.add("");
        }else{
            for(String s:splitStr){
                decodedList.add(s);

            }

        }
        return decodedList;

    }
}
