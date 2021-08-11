import java.util.*;

public class SortStack {
    public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		reverse(s);
		return s;
	}
	
	public void reverse(Stack<Integer> s){
	    if(!s.isEmpty()){
	        int val = s.pop();
	        reverse(s);
	        insert(s,val);
	    }
	}
	
	public void insert(Stack<Integer> s, int val){
	    if(s.isEmpty() || s.peek()<=val) {
	        s.push(val);
	        return;
	    }
	    int x = s.pop();
	    insert(s,val);
	    s.push(x);
}
