public class SubArrSumZero{
    public static long findSubarray(long[] arr ,int n) 
    {
        long count = 0;
        
        long sum = 0;
        int i=-1;
        
        HashMap<Long, Integer> map = new HashMap<>();
        map.put((long)0,1);
        
        while(i<n-1){
            i++;
            sum += arr[i];
            
            if(map.containsKey(sum)){
                count += map.get(sum);
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum, 1);
            }
        }
        
        return count;
    }
}