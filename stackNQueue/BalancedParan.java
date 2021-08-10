import java.util.*;

public class BalancedParan {
    static boolean ispar(String x){
        // add your code here
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='['){
                stack.push(x.charAt(i));
            }
            else{
                if(stack.isEmpty()) return false;
                if(x.charAt(i)==')' && stack.peek()=='('){
                    stack.pop();
                }
                else if (x.charAt(i)==']' && stack.peek()=='['){
                    stack.pop();
                }
                else if(x.charAt(i)=='}' && stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
