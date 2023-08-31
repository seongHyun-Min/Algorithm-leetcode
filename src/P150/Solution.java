package P150;

import java.util.*;
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int a2 = stack.pop();
                int a1 = stack.pop();
                if(s.equals("+")){
                    stack.push(a1+a2);
                }else if(s.equals("-")){
                    stack.push(a1-a2);
                }else if(s.equals("*")){
                    stack.push(a1 * a2);
                }else{
                    stack.push(a1/a2);
                }
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}