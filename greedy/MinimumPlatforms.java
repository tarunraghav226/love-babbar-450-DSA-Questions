import java.util.Arrays;

public class MinimumPlatforms {
    static int findPlatform(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat=1, res=1;

        int i=1, j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat++;
                i++;
            }
            else {
                plat--;
                j++;
            }
            res = Math.max(plat, res);
        }

        return res;
    }
}
