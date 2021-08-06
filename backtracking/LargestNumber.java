public class LargestNumber {
    public static String max;
    public static String findMaximumNum(String str, int k){
        if(Integer.valueOf(str)>Integer.valueOf(max)){
            max = str;
        }

        if(k==0) return max;

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length(); j++){
                if(str.charAt(j)>str.charAt(i)){
                String swapped = swap(str, i, j);
                findMaximumNum(swapped, k-1);
                }
            }
        }
        return str;
    }

    public static String swap(String str, int i, int j){
        String left = str.substring(0,i);
        String middle = str.substring(i+1,j);
        String right = str.substring(j+1);

        return left+str.charAt(i)+middle+str.charAt(j)+right;
    }
}
