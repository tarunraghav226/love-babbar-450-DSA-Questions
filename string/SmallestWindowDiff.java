public class SmallestWindowDiff{
    public static String smallestWindow(String s, String p){
        if(s.length() < p.length()) return "";

        int[] hash_ptr = new int[256];
        int[] hash_str = new int[256];

        int count = 0, start = 0, startIndex = -1, minLen = Integer.MAX_VALUE;

        for (int i = 0; i < p.length(); i++)
            hash_ptr[p.charAt(i)]++;
 

        for(int i=0;i<s.length();i++){
            hash_str[s.charAt(i)]++;
            if(hash_str[s.charAt(i)] < hash_ptr[p.charAt(i)])
                count++;
            if(count == p.length()){
                while(hash_str[s.charAt(start)] > hash_ptr[s.charAt(start)] || hash_ptr[s.charAt(start)] == 0){
                    if(hash_str[s.charAt(start)] > hash_ptr[s.charAt(start)]) hash_str[s.charAt(start)]--;
                    start++;
                }
                if(minLen > i-start+1){
                    minLen = i-start+1;
                    startIndex = start;
                }
            }
        }
        return s.substring(startIndex, p.length());
    }
}