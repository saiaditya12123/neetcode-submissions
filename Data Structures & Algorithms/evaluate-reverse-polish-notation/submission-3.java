class Solution {
    public int evalRPN(String[] tokens) {
               int total=0;
        Stack<String> stack=new Stack<>();
        for(int i=0;i<=tokens.length-1;i++){
            if(tokens[i].matches("^(-)?[0-9]{1,}$")){
                  stack.push(tokens[i]);
            }else{
                  if(!stack.isEmpty()){
                    int a=Integer.parseInt(stack.pop());
                    int b=Integer.parseInt(stack.pop());
                    switch (tokens[i]) {
                        case "+":
                           total=a+b;
                           stack.push(String.valueOf(total));
                           break;
                        case "-":
                           total=b-a;
                           stack.push(String.valueOf(total));
                           break;
                        case "*":
                           total=a*b;
                           stack.push(String.valueOf(total));
                           break;
                        case "/":
                           total=b/a;
                           stack.push(String.valueOf(total));
                           break;

                    }
                  
         
                }
            }

        }
        return Integer.parseInt(stack.peek());
    }
}
