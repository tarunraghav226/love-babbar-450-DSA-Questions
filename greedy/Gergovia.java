import java.util.ArrayList;
import java.util.Scanner;

public class Gergovia {
    static class Pair{
        int val;
        int ind;
    }
    public static void main (String[] args) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t!=0){
            int n = scanner.nextInt();
            ArrayList<Pair> buy = new ArrayList<>();
            ArrayList<Pair> sell = new ArrayList<>();

            for(int i=0;i<n;i++) {
                int temp = scanner.nextInt();
                Pair pair = new Pair();
                pair.val = temp;
                pair.ind = i;

                if(temp<0){
                    sell.add(pair);
                }
                else buy.add(pair);
            }

            int i=0, j=0, work=0;
            while(i<buy.size() && j<sell.size()){
                int min = Math.min(buy.get(i).val, -sell.get(j).val);
                int diff = Math.abs(buy.get(i).ind-sell.get(j).ind);
                buy.get(i).val -= min;
                
                sell.get(j).val += min;

                if(buy.get(i).val==0) i++;
                if(sell.get(j).val == 0) j++;

                work += (diff * min);
                
            }
            System.out.println(work);
        }
        scanner.close();
	}
}
