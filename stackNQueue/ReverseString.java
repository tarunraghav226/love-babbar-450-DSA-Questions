import java.util.*;

public class ReverseString {
    public String reverse(String S){
        //code here
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int n = S.length();
        for(int i=0;i<n;i++){
            stack.push(S.charAt(i));
        }
        for(int i=0;i<n;i++){
            str.append(stack.pop());
        }
        return str.toString();
    }
}
