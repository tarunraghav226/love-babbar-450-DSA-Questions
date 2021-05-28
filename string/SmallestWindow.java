import java.util.Arrays;

public class SmallestWindow {
    public String findSubString( String str) {
        // Your code goes here
        int start = 0, startIndex=-1, j=0;
        int minLen = Integer.MAX_VALUE;
        int[] curr_count = new int[256];
        int count = 0;

        boolean[] visited = new boolean[256];
        int dist_count = 0;
        Arrays.fill(visited, false);
        for(int i=0;i<str.length();i++){
            if(!visited[str.charAt(i)]){
                dist_count++;
                visited[str.charAt(i)] = true;
            }
        }
        
        for(j=0;j<str.length();j++){
            curr_count[str.charAt(j)]++;
            if(curr_count[str.charAt(j)] == 1) count ++;

            if(count == dist_count){
                while(curr_count[str.charAt(start)] > 1){
                    if(curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }
            
                if(minLen < j-start+1){
                    minLen = j-start+1;
                    startIndex = start;
                }
            }

        }
        return str.substring(startIndex,startIndex+minLen);
    }
}
