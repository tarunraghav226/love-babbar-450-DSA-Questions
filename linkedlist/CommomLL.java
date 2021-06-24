package linkedlist;

public class CommomLL {
    int len(Node node){
        if(node == null) return 0;
        int l = 0;
        while(node != null){
            l++;
            node = node.next;
        }
        return l;
    }
    int intersectPoint(Node head1, Node head2){
        int l1 = len(head1);
        int l2 = len(head2);

        if(l1<l2){
            int skip = l2-l1;
            while(skip != 0){
                head2=head2.next;
                skip--;
            }
        }
        else{
            int skip = l1-l2;
            while(skip != 0){
                head1 = head1.next;
                skip--;
            }
        }
        
        Node ans = null;
        while(head1!=null && head2!=null){
            if(head1.data == head2.data) {
                if(ans==null)
                    ans = head1;
            }
            else ans = null;
            head1 = head1.next;
            head2 = head2.next;
        }
        if(ans != null) return ans.data;
        return -1;
	}
}
