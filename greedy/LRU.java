import java.util.ArrayList;

public class LRU{
    static int find(ArrayList<Integer> pages, int n, int key){
        for(int i=0;i<n;i++){
            if(pages.get(i)==key) return i;
        }
        return -1;
    }
    static int pageFaults(int N, int C, int pages[]){
        ArrayList<Integer> arr = new ArrayList<>();
        int counter = 0;
        for(int i=0;i<N;i++){
            int pos = find(arr, N, pages[i]);
            if(pos==-1){
                if(arr.size()==C){
                    arr.remove(0);
                }
                arr.add(pages[i]);
                counter++;
            }
            else{
                arr.remove(pos);
                arr.add(pages[i]);
            }
        }
        return counter;
    }
}