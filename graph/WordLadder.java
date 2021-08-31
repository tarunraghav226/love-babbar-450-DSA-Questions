package graph;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        boolean isPresent = false;
        for(String s: wordList){
            if(s.compareTo(endWord)==0) isPresent=true;
            set.add(s);
        }
        if(!isPresent) return 0;
        
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        
        int depth=0;
        while(!q.isEmpty()){
            depth+=1;
            int lSize = q.size();
            while(lSize-->0){
                String curr = q.poll();
                for(int i=0;i<curr.length();i++){
                    StringBuilder temp = new StringBuilder(curr);
                    for(char j='a';j<='z';j++){
                        temp.setCharAt(i, j);
                        String newW = temp.toString();
                        if(newW == curr)
                            continue;
                        if(newW.compareTo(endWord) == 0)
                            return depth+1;
                        if(set.contains(newW)){
                            set.remove(newW);
                            q.add(newW);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
