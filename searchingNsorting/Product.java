public class Product {
    public static long[] productExceptSelf(int nums[], int n) { 
        long[] output = new long[n];
        
        long product = 1;
        for(int i=0;i<n;++i)
        {
            product *= nums[i];
            output[i]=product;            
        }
        
        //Traverse from right and update output array
        product = 1;
        for(int i=n-1;i>0;--i)
        {
            output[i] = output[i-1]*product;
            product *= nums[i];
        }
        output[0] = product;
        
        return output;

	} 
}
