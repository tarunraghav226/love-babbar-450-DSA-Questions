import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DEFKIN {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int w,h,n;
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            w = scan.nextInt();
            h = scan.nextInt();
            n = scan.nextInt();
            arr1.add(0);
            arr2.add(0);

            for(int i=0;i<n;i++){
                arr1.add(scan.nextInt());
                arr2.add(scan.nextInt());
            }
            arr1.add(w+1);
            arr2.add(h+1);

            Collections.sort(arr1);
            Collections.sort(arr2);

            int maxw = 0;
            int maxh = 0;

            for(int i=0;i<n-1;i++){
                maxw = Math.max(maxw, arr1.get(i+1)-arr1.get(i)-1);
                maxh = Math.max(maxh, arr2.get(i+1)-arr2.get(i)-1);
            }
            System.out.println(maxh*maxw);

        }
	}
}
