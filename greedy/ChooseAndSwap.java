import java.util.SortedSet;
import java.util.TreeSet;

public class ChooseAndSwap {
    String chooseandswap(String A){
        char[] arr = A.toCharArray();
        SortedSet<Character> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++) set.add(arr[i]);
        for(int i=0;i<arr.length;i++){
            set.remove(arr[i]);
            if (set.isEmpty()) break;
            char ch = set.first();
            if(ch<arr[i]){
                char ch2 = arr[i];
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==ch)arr[j] = ch2;
                    else if(arr[j]==ch2) arr[j]= ch;
                }
                break;
            }
        }
        return String.valueOf(arr);
    }
}
