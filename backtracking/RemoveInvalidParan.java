import java.util.*;

public class RemoveInvalidParan{
    public List<String> removeInvalidParentheses(String s) {
        int mr = minimumRemoval(s);
        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        remove(mr, s, list, set);
        return list;
    }
    
    public void remove(int mr, String s, List<String> list, HashSet<String> set){
        if(mr == 0){
            int check = minimumRemoval(s);
            if(check == 0 && !set.contains(s)){
                list.add(s);
                set.add(s);
                return;
            }
            return;
        }
        for(int i=0;i< s.length(); i++){
            if(s.charAt(i)!='(' && s.charAt(i)!=')')
                continue;
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            if(!set.contains(left+right)){
                remove(mr-1, left+right, list, set);
            }
        }
    }
    
    public int minimumRemoval(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='(' && s.charAt(i)!=')')
                continue;
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else{
                if(stack.isEmpty()){
                    stack.push(')');
                } else if (stack.peek()==')') stack.push(')');
                else if (stack.peek()=='(') stack.pop();
            }
        }
        return stack.size();
    }
}