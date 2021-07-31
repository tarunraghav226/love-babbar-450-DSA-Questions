import java.util.*;

public class WordBreak{
    static List<String> wordBreak(int n, List<String> dict, String s){
        String ans = "";
        List<String> ansList = new ArrayList<>();
        wordBreakUtil(s.length(), dict, s, ans, ansList);
        return ansList;
    }

    static void wordBreakUtil(int n, List<String> dict, String s, String ans, List<String> ansList){
        for(int i=1;i<=n;i++){
            String temp = s.substring(0,i);
            if(dict.contains(temp)){
                if(i==n){
                    ansList.add(ans+temp);
                    return;
                }
                wordBreakUtil(n-i, dict, s.substring(i,n), ans+temp+" ", ansList);
            }
        }
    }
}