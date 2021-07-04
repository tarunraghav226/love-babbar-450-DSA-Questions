package linkedlist;

public class MergeKSorted {
    Node merge(Node a, Node b){
        if(a==null) return b;
        if(b==null) return a;
        Node result = null;
        if(a.data<=b.data){
            result=a;
            result.next = merge(a.next, b);
        }
        else{
            result=b;
            result.next = merge(a,b.next);
        }
        return result;
    }

    Node mergeKList(Node[]arr,int k){
        int last=k-1;
        while(last!=0){
            int i=0, j=last;
            while(i<j){
                arr[i] = merge(arr[i], arr[j]);
                i++; j--;
            }
            last=j;
        }
        return arr[0];
    }
}
