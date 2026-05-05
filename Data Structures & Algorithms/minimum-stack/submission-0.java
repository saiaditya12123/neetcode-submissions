class MinStack {

       Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
        stack2.push(Integer.MAX_VALUE);

    }

    public void push(int val) {
        stack1.push(val);
        stack2.push(Math.min(stack2.peek(),val));

    }

    public void pop() {
        stack2.pop();
        stack1.pop();

    }

    public int top() {
        return stack1.peek();

    }

    public int getMin() {
        return stack2.peek();

    }
}
