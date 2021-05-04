import java.util.HashMap;

class RearrangeNegPos{
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum ==0 ){
                max = i+1;
            }
            else{
                if(map.get(sum) != null){
                    if(max < i-map.get(sum)){
                        max = i-map.get(sum);
                    }
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return max != 0;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        System.out.println(findsum(arr, arr.length));
    }
}