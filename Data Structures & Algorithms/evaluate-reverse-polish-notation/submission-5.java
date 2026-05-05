class Solution {
    public int evalRPN(String[] tokens) {
             Stack<String> stack=new Stack<>();
        for(int i=0;i<=tokens.length-1;i++){
            if(tokens[i].matches("^-?\\d+(\\.\\d+)?$")){
                stack.push(tokens[i]);
            }else if(tokens[i].equals("+")){
                int op1=Integer.valueOf(stack.pop());
                int op2=Integer.valueOf(stack.pop());

                stack.push(String.valueOf(op1+op2));

            }else if(tokens[i].equals("-")){
                int op1=Integer.valueOf(stack.pop());
                int op2=Integer.valueOf(stack.pop());
                stack.push(String.valueOf(op2-op1));


            }else if(tokens[i].equals("/")){
                int op1=Integer.valueOf(stack.pop());
                int op2=Integer.valueOf(stack.pop());
                stack.push(String.valueOf((int)op2/op1));

            }else if(tokens[i].equals("*")){
                int op1=Integer.valueOf(stack.pop());
                int op2=Integer.valueOf(stack.pop());
                stack.push(String.valueOf(op2*op1));

            }


        }
        return Integer.valueOf(stack.peek());
    }
}
