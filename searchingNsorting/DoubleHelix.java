import java.util.Scanner;

public class DoubleHelix {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
        while(true){
            int n1 = scan.nextInt();
            if(n1==0) break;

            int[] arr1 = new int[n1];
            for(int i=0;i<n1; i++) arr1[i] = scan.nextInt();

            int n2 = scan.nextInt();
            int[] arr2 = new int[n2];
            for(int i=0;i<n2;i++) arr2[i] = scan.nextInt();

            int s1=0, s2=0;
            int ma=0;

            int i=0, j=0;
            while(i<n1 && j<n2){
                if(arr1[i]<arr2[j]){
                    s1+=arr1[i];
                    i++;
                }
                else if(arr2[j] < arr1[i]){
                    s2+=arr2[j];
                    j++;
                }
                else{
                    ma += (Math.max(s1, s2)+arr1[i]);
                    s1=0;s2=0;
                    i++;j++;
                }
            }
            while(i<n1){
                s1+=arr1[i++];
            }
            while(j<n2){
                s2+=arr2[j++];
            }
            ma += Math.max(s1, s2);
            System.out.println(ma);
        }
	}
}
