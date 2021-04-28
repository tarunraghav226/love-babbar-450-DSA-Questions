import java.util.ArrayList;

public class CommonElements {
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here
        ArrayList<Integer> arr = new ArrayList<>(); 
        int i =0, j=0, k=0;
        int prev1 = Integer.MIN_VALUE, prev2 = Integer.MIN_VALUE, prev3 =Integer.MIN_VALUE;
        while(i<A.length && j<B.length && k<C.length){
            while( i<n1 && A[i]==prev1) i++;
            while(j<n2 && B[j]==prev2) j++;
            while(k<n3 && C[k]==prev3) k++;

            if(!(i<n1 && j<n2 && k<n3)){
                continue;
            }
            

            if(A[i] == B[j] && B[j] == C[k]){
                arr.add(A[i]);
                prev1 = A[i];
                prev2 = B[j];
                prev3 = C[k];
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j]){
                    prev1 = A[i];
                    i++;
                }
                    else if(B[j] < C[k]){
                        prev2=B[j];
                        j++;
                    }
                        else {
                            prev3 = C[k];
                            k++;
                        }
        }
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
