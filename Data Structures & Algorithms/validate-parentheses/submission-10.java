class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.add(s.charAt(i));
            }else if(!stack.isEmpty()){
                char top = stack.pop();
                if((s.charAt(i)==')' && top!='(')||(s.charAt(i)==']' && top!='[')||(s.charAt(i)=='}' && top!='{')){
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}