public class FlipChar {
    public int findFlip(String s, char exp){
        int flips = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != exp) flips ++;
            exp = (exp == '0')? '1':'0';
        }
        return flips;
    }

    public int minFlips(String S) {
        // Code here
        return Math.min(findFlip(S,'1'),findFlip(S,'0'));
    }
}
