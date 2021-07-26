public class SmallestNumber {
    static String smallestNumber(int s, int d){
        if(d*9<s) return "-1";
        s -= 1;
        int[] arr = new int[d];
        for(int i=d-1;i>0;i--){
            if(s>9){
                arr[i] = 9;
                s -= 9;
            }
            else{
                arr[i] = s;
                s = 0;
            }
        }
        arr[0] = s+1;
        String str ="";
        for(int i=0;i<d;i++) str+=arr[i];
        return str;
    }
}
