public class MajorityElement {
    static int majorityElement(int a[], int size){
        if(size == 1) return a[0];
        
        int ele = a[0];
        int count = 1;

        for(int i=1;i<size;i++){
            if(ele == a[i]) count++;
            else count--;

            if(count == 0){
                ele = a[i];
                count = 1;
            }
        }
        
        int c=0;
        for(int i=0;i<size;i++){
            if(a[i] == ele) c++;
        }

        if(c >size/2) return ele;

        return -1;
    }
}
