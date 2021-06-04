public class MissingNRepeating{
    int[] findTwoElement(int arr[], int n) {
        int x=0, y=0;
        
        int xor1 = arr[0];
        for(int i=1;i<n;i++){
            xor1 = xor1 ^ arr[i]; 
        }
        for(int i=1;i<=n;i++)
            xor1 = xor1 ^ i;
            
        int set_bit_no = xor1 & ~(xor1 - 1);
  
        int i;
        for (i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0)
                x = x ^ arr[i];
            else
                y = y ^ arr[i];
        }
        for (i = 1; i <= n; i++) {
            if ((i & set_bit_no) != 0)
                x = x ^ i;
  
            else
                y = y ^ i;
        }
        int[] prr = new int[2];
        prr[0] = x;
        prr[1] = y;
        return prr;
    }
}