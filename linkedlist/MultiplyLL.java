package linkedlist;

public class MultiplyLL {
    public long getNumber(Node node){
        long modNum = 1000000007;
        if(node==null) return 0;
        int m=10;
        long num=0;
        while(node!=null){
            num = ((num*m)%modNum+node.data)%modNum;
            node = node.next;
        }
        return num;
    }
    public long multiplyTwoLists(Node l1,Node l2){
        long modNum = 1000000007;
        long n1 = getNumber(l1);
        long n2 = getNumber(l2);

        return ((n1%modNum) * (n2%modNum))%modNum;
    }
}
