package linkedlist;

public class NthNodeFromEnd {
    int getNthFromLast(Node head, int n){	
    	int len =0;
    	if(head == null) return -1;
    	
    	Node temp = head;
    	while(temp!=null){
    	    len++;
    	    temp=temp.next;
    	}
    	
    	if(len<n) return -1;
    	
    	int i=1;
    	temp=head;
    	while(i<len-n+1){
    	    temp=temp.next;
    	    i++;
    	}
    	return temp.data;
    }
}
