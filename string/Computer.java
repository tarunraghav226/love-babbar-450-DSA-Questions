public class Computer {
    static int runCustomerSimulation(int n, char []seq){
        int res = 0;
        int occupied = 0;

        int[] seen = new int[256];

        for(int i=0;i<seq.length;i++){
            int ind = seq[i] - 'A';

            if(seen[ind] == 0){
                seen[ind] = 1;

                if(occupied < n){
                    occupied++;
                    seen[ind] = 2;
                }
                else{
                    res++;
                }

            }
            else{
                if(seen[ind] == 2){
                    occupied --;
                }
                seen[ind] = 0;
            }
        }

        return res;
    }    
}
