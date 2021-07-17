package bst;

public class NodeInRange {
    class Counter{
        int c;
    }
    
    void solve(Node root,int l, int h, Counter c){
        if(root==null) return;
        if(root.data >=l && root.data<=h) { 
            c.c = c.c+1;
            solve(root.left, l, h, c);
            solve(root.right, l, h, c);
        }else if(root.data > h) solve(root.left, l, h, c);
        else if(root.data < l) solve(root.right, l, h, c);
    }
    
    int getCount(Node root,int l, int h)
    {
        //Your code here
        Counter c = new Counter();
        c.c=0;
        solve(root, l, h, c);
        return c.c;
    }
}
