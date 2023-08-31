package P_155;

import java.util.*;
public class MinStack {
    static int min;
    static Stack<Integer> stack = new Stack();
    public MinStack() {
        stack = new Stack<Integer>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        min = Integer.MAX_VALUE;
        for(Integer target : stack){
            min = Math.min(min, target);
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        System.out.println("minStack = " + minStack.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */