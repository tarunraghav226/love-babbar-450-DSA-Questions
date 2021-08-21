import java.util.*;

public class ValidSubstring {
    static int findMaxLen(String s) {
        Stack<Character> ct = new Stack();
        Stack<Integer> index = new Stack();
        index.add(-1);
        int max = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ct.add('(');
                index.add(i);
            }else{ //closing bracket
                if(!ct.isEmpty() && ct.peek()=='('){
                    ct.pop();
                    index.pop();
                    max = Math.max(max, i-index.peek());
                }else{
                   index.add(i); 
                }
            }
        }
     return max;
    }
}
