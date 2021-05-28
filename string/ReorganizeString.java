public class ReorganizeString {

    public int getMaxChar(int[] count){
        int max = 0;
        int charMax = 0;
        for(int i=0;i<count.length;i++){
            if(max < count[i]) { 
                max = count[i];
                charMax = 'a'+i;
            }
        }
        return charMax;
    }

    public String reorganizeString(String s) {
        int[] count = new int[26];
        
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        int max_char = getMaxChar(count);
        int max_count = count[max_char-'a'];

        if(max_count > (s.length()+1)/2) return "";

        int ind = 0;
        char[] charArr = new char[s.length()];
        while(max_count != 0){
            charArr[ind] = (char)max_char;
            ind+=2;
            max_count--;
        }
        count[max_char-'a'] = 0;

        for(int i=0;i<26;i++){
            while(count[i] > 0){
                ind = ind>=s.length()?1:ind;
                charArr[ind] = (char)('a' + i);
                ind+=2;
                count[i]--;
            }
        }
        return String.valueOf(charArr);
    }
}
