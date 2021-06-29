package linkedlist;

import java.util.*;

public class KSorted {

    static class Node{
        int data;
        Node next, prev;
        Node(int d){
        data = d;
        next = prev = null;
        }
    }   
    
    class CompareNode implements Comparator<Node>{
        @Override
        public int compare(Node o1, Node o2) {
            return o1.data-o2.data;
        }
    }

    Node sortAKSortedDLL( Node head, int k){
        Node newDLL = null, last = null;
        PriorityQueue<Node> pq = new PriorityQueue<Node>(new CompareNode());

        for(int i=0; head!=null && i<=k;i++){
            pq.add(head);
            head = head.next;
        }

        while(!pq.isEmpty()){
            if(newDLL == null){
                newDLL = pq.peek();
                newDLL.prev = null;
                last = newDLL;
            }
            else{
                last.next = pq.peek();
                last.next.prev = last;
                last = last.next;
            }
            pq.poll();
            pq.add(head);

            if (head != null){
                pq.add(head);
                head = head.next;
            }
        }
        last.next = null;
    }
}
