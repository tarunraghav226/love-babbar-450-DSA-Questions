import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> list = new ArrayList<>();
        permute(S, 0, S.length()-1, list);
        Collections.sort(list);
        return list;
    }
    private void permute(String str, int l, int r, List<String> list)
    {
        if (l == r)
            list.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r, list);
                str = swap(str,l,i);
            }
        }
    }
 
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
