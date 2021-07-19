import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NMeeting {
    static class Pair{
        int start;
        int end;
    }
    static class Comparison implements Comparator<Pair>{
        @Override
        public int compare(Pair o1, Pair o2) {
            if(o1.end<=o2.start) return 1;
            else return -1;
            return 0;
        }
    }
    public static int maxMeetings(int start[], int end[], int n){
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            Pair pair = new Pair();
            pair.start = start[i];
            pair.end = end[i];
            arr.add(pair);
        }
        Comparison comparison = new Comparison();
        Collections.sort(arr, comparison);
        int count = 0;
        Pair obj = arr.get(0);
        int endo = obj.end;
        for(int i=1;i<n;i++){
            if(endo<=arr.get(i).start) {
                count++;
                endo = arr.get(i).end;
            }
        }
        return count;
    }
}
