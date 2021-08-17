package stackNQueue;

import java.util.*;

public class ReverseQueue {
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        if(q.isEmpty()){
            return q;
        }
        int val = q.poll();
        rev(q);
        q.add(val);
        return q;
    }
}
