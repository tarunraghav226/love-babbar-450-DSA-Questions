public class ThreeWayPart {
    public void threeWayPartition(int arr[], int lowVal, int highVal)
    {
        // code here 
        int n = arr.length;
        int start = 0, end = n-1;
  
        for (int i=0; i<=end;)
        {
            if (arr[i] < lowVal){
                int t = arr[i];
                arr[i] = arr[start];
                arr[start] = t;
                start++;
                i++;
            }
      
            else if (arr[i] > highVal){
                int t = arr[i];
                arr[i] = arr[end];
                arr[end] = t;
                end--;
            }
            else i++;
        }
    }
}

