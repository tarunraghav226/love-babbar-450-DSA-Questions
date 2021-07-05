package tree;

public class DiameterOfTree {
    int ma;
    int diameter(Node root) {
       ma = Integer.MIN_VALUE;
       findDia(root);
       return ma;
   }

   int findDia(Node node){
       if(node==null) return 0;
       int leftMa = findDia(node.left);
       int rightMa = findDia(node.right);

       ma = Math.max(ma, leftMa+rightMa+1);
       return Math.max(leftMa, rightMa)+1;
   }
}
