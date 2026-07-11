class MinStack {

    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        this.stack.push(val);

        Integer topMinStack = minStack.peek();

        if (topMinStack == null || topMinStack >= val) {
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        Integer n = stack.pop();

        if (n.equals(minStack.peek())){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}
