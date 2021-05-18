public class TrappingRainwater {
    static int trappingWater(int a[], int n) { 
      int l=0, r=n-1, leftMax=0, rightMax=0, res = 0;
      while(l<r){
          if(a[l]<=a[r]){
            if(a[l]>=leftMax)
                leftMax = a[l];
            else
                res += (leftMax - a[l]);
            l++;
          }
          else{
            if(a[r]>=rightMax)
                rightMax = a[r];
            else
                res += (rightMax - a[r]);
            r--;
          }
      }
      return res;
    } 
    public static void main(String[] args) {
        int[] arr = {7,4,0,9};
        System.out.println(trappingWater(arr, arr.length));
    }
}
