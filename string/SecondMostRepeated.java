import java.util.HashMap;

public class SecondMostRepeated {
    static String secFrequent(String arr[], int N){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
            else map.put(arr[i], 1);
        }
        String f_max ="", s_max="";
        int f_mox_count =0, s_max_count=0;

        for(String key: map.keySet()){
            if(f_mox_count < map.get(key)){
                s_max_count = f_mox_count;
                s_max= f_max;
                f_mox_count = map.get(key);
                f_max = key;
            }
            else if(s_max_count < map.get(key) && map.get(key) < f_mox_count){
                s_max_count = map.get(key);
                s_max = key;
            }
        }

        return s_max;
    }
}
