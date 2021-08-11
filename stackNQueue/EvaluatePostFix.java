public class EvaluatePostFix {
    public static int evaluatePostFix(String S)
    {
        // Your code here
        int n = S.length();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(S.charAt(i)=='*' || S.charAt(i)=='/' || S.charAt(i)=='+' || S.charAt(i)=='-'){
                int right=stack.pop();
                int left=stack.pop();
                switch(S.charAt(i)){
                    case '*': stack.push(left*right); break;
                    case '/': stack.push(left/right); break;
                    case '+': stack.push(left+right); break;
                    case '-': stack.push(left-right); break;
                    default: break;
                }
            }
            else{
                stack.push(Integer.parseInt(S.charAt(i)+""));                
            }
        }
        return stack.pop();
    }
}
