package bst;

public class CountPairs {
    static class Counter{
        int c;
    }

    static boolean found(Node root, int val){
        if(root == null) return false;
        if(root.data == val) return true;
        return found(root.left, val) || found(root.right, val);
    }

    static void solve(Node root1, Node root2, int x, Counter counter){
        if(root1 == null) return;
        solve(root1.left, root2, x, counter);
        if(found(root2, x-root1.data)) counter.c = counter.c+1;
        solve(root1.right, root2, x, counter);
    }

    public static int countPairs(Node root1, Node root2, int x){
        Counter counter = new Counter();
        counter.c = 0;
        solve(root1, root2, x, counter);
        return counter.c;
    }
}
