import java.util.ArrayList;

public class WordBreak{
    public static int wordBreak(String word, ArrayList<String> dictionary)
    {
        int size = word.length();
         
        // base case
        if (size == 0)
        return 1;
         
        //else check for all words
        for (int i = 1; i <= size; i++)
        { 
            if (dictionary.contains(word.substring(0,i)) &&
                    wordBreak(word.substring(i,size), dictionary)==1)
            return 1;
        }
         
        return 0;
    }
}