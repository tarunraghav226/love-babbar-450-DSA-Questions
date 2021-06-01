public class Transform {
    public int transform(String A, String B){
        int n = A.length();
        int m = B.length();

        if(n!=m) return -1;
    
        int[] count = new int[256];
        for(int i=0;i<n;i++){
            count[(int)(A.charAt(i)-'A')]++;
            count[(int)(B.charAt(i)-'A')]--;
        }

        for(int i=0;i<256; i++){
            if(count[i] != 0) return -1;
        }

        int i=n-1, j=m-1;
        int res =0;

        while(i>=0){
            if(A.charAt(i) != B.charAt(j))
                res++;
            else
                j--;
            i--;
        }

        return res;
    }
}
