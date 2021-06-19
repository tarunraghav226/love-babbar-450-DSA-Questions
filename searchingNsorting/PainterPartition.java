import java.util.ArrayList;

public class PainterPartition {
    public int paint(int A, int B, ArrayList<Integer> C) {
        int totalLength =0, k=0;
        for(int i=0;i<C.size();i++){
            k=Math.max(k, C.get(i));
            totalLength += C.get(i);
        }

        int low=k, high=totalLength;

        while(low<high){
            int target = low + (high-low)/2;
            int painters = isFeasible(C, target);
            if(painters<=A){
                high=target;
            }
            else{
                low=target+1;
            }
        }
        return (low%10000003)*(B% 10000003)% 10000003;
    }

    public int isFeasible(ArrayList<Integer> arr, int target){
        int painters=1, sum=0;
        for(int val:arr){
            sum+=val;
            if(sum>target){
                sum = val;
                painters++;
            }
        }
        return painters;
    }
}
