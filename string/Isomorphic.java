import java.util.HashMap;

class Isomorphic{
    public static boolean areIsomorphic(String str1,String str2){
        if(str1.length() != str2.length()) return false;
        
        char[] map1 = new char[256];
        char[] map2 = new char[256];

        for(int i=0;i<str1.length();i++){
            if(map1[str1.charAt(i) - 'a'] == 0 && map2[str2.charAt(i) - 'a'] == 0){
                map1[str1.charAt(i) - 'a'] = str2.charAt(i);
                map2[str2.charAt(i) - 'a'] = str1.charAt(i);
            }
            else if(map1[str1.charAt(i) - 'a'] != str2.charAt(i)) return false;
        }
        return true;
    }
}