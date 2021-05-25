import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {
    static boolean ispar(String x){
        // add your code here
        Stack<String> stack = new Stack<>();
        HashMap<String, String> map = new HashMap<>();
        map.put("{", "}");
        map.put("[", "]");
        map.put("(", ")");
        for(int i=0;i<x.length();i++){
            if(x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '[')
                stack.push(x.charAt(i)+"");
            else{
                String popChar = stack.pop();
                if(map.get(popChar) != x.charAt(i)+"")
                    return false;
            }
        }
        return true;
    }
}
