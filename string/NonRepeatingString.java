package string;

import java.util.ArrayList;

public class NonRepeatingString {
    public String FirstNonRepeating(String A){
        int[] visited = new int[26];
        ArrayList<Character> order = new ArrayList<>();
        StringBuffer answer = new StringBuffer();
        for(int i=0; i<A.length();i++){
            if(visited[A.charAt(i)-'a']==0){
                order.add(A.charAt(i));
            }
            visited[A.charAt(i)-'a']++;
            int f=0;
            for(int j=0;j<order.size();j++){
                if(visited[order.get(j)]==1){
                    answer.append(order.get(j));
                    f=1;
                    break;
                }
            }
            if(f==0){
                answer.append("#");
            }
        }
        return answer.toString();
    }
}
