class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
                int[] results=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for(int j=0;j<=temperatures.length-1;j++){
            while (!stack.isEmpty() && temperatures[j]>temperatures[stack.peek()]) {
                int i=stack.pop();
                results[i]=j-i;
                
            }
            stack.push(j);
        }
        return results;
    }
}
