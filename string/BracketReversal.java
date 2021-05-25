import java.util.Stack;

public class BracketReversal {
    int countRev (String s){
        if (s.length()%2 != 0)
        return -1;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='}' && !stack.isEmpty()){
                if(stack.peek() == '{') stack.pop();
                else stack.push(c);
            }
            else
                stack.push(c);
        }     

        int red_size = stack.size();

        int n = 0;
        while(!stack.isEmpty() && stack.peek()=='{'){
            stack.pop();
            n++;
        }
        return red_size/2 + n%2;
    }
}
