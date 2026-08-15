class MinStack {
    //build ur own stack called minstack all O(1) req
   Deque<Integer> stack = new ArrayDeque<>();
   Deque<Integer> minstack = new ArrayDeque<>();

    public MinStack() {
    }
    
    public void push(int value) {
         stack.push(value);
         if(minstack.isEmpty()) minstack.push(value);

         else minstack.push(Math.min(value,minstack.peek()));
    }
    
    public void pop() {
        minstack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */