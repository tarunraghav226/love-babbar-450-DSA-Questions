import java.util.ArrayList;

public class MinSwaps {
    static int minimumNumberOfSwaps(String S){
        int close = 0;
        int open = 0;
        int fault = 0;
        int ans = 0;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == ']'){
                close++;
                fault = close - open;
            }
            else{
                open++;
                if(fault > 0){
                    ans += fault;
                    fault--;
                }
            }
        }

        return ans;
    }
}
