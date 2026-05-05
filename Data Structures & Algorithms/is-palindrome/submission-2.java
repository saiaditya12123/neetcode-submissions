class Solution {
    public boolean isPalindrome(String s) {
                int left=0;
        int right=s.length()-1;
        while (left<right){
            if(!Character.toString(s.charAt(left)).matches("[a-zA-Z0-9]")){
                left++;
            }else if(!Character.toString(s.charAt(right)).matches("[a-zA-Z0-9]")){
                right--;
            }else if(Character.toString(s.charAt(left)).equalsIgnoreCase(Character.toString(s.charAt(right)))){
                left++;
                right--;
            }else{
                return false;
            }
        }

        return  true;
    }
}
