class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack= new Stack<>();
    int[] result=new int[temperatures.length];
    for(int i=0;i<=temperatures.length-1;i++){
        while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
            int popped=stack.pop();
            int diff=i-popped;
            result[popped]=diff;

        }
        stack.push(i);
    }
    return result; 
    }
}
