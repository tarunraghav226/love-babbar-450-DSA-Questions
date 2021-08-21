import java.util.*;

public class GameWithString{
    static int minValue(String str, int k){
        int l = str.length(); 
 
        if (k >= l)
            return 0;
 
        int[] frequency = new int[26];
        for (int i = 0; i < l; i++)
            frequency[str.charAt(i) - 'a']++;
 
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
 
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0)
                q.add(frequency[i]);
        }
 
        while (k != 0) {
            q.add(q.poll() - 1);
            k--;
        }
 
        int result = 0; 
        while (!q.isEmpty()) {
            result += q.peek() * q.poll();
        }
 
        return result;
    }
}