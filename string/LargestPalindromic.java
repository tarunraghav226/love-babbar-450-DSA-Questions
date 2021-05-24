public class LargestPalindromic {
    static int longestPalin(String S){
        // code here
        int max_size =1;

        for(int i=1;i<S.length(); i++){
            int low = i-1;
            int high = i;

            while(low>=0 && high <= S.length() && S.charAt(low) == S.charAt(high)){
                max_size = (high-low+1 > max_size)?high-low+1:max_size;
                low--;
                high++; 
            }

            low = i-1;
            high = i+1;
            while(low>=0 && high <= S.length() && S.charAt(low) == S.charAt(high)){
                max_size = (high-low+1 > max_size)?high-low+1:max_size;
                low--;
                high++; 
            }
        }

        return max_size;
    }
}
