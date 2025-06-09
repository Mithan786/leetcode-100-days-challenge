#Q-1:  Implement Queue using Stacks?
  class MyQueue {
    private Stack <Integer> min;
    private Stack <Integer> helper;
    public MyQueue() {
        min = new Stack <>();
        helper = new Stack <>();
    }
    
    public void push(int x) {
        // add all the elements from min to helper--min-> helper
        while(min.size()>0){
            helper.push(min.pop());
        }
        // add X to min Stack
        min.push(x);
        // add all the elementes from helper to min -- helper --> min
        while(helper.size()>0){
            min.push(helper.pop());
        }
    }
    
    public int pop() {
        return min.pop();
    }
    
    public int peek() {
        return min.peek();
    }
    
    public boolean empty() {
        return min.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
