package tree;

import java.util.HashMap;

public class BuildTree {
    static int preIn=0;

    static Node buildTreeUtil(int startIn, int endIn, int inorder[], int preorder[], HashMap<Integer, Integer> map){
        if(startIn>endIn) return null;

        Node tNode = new Node(preorder[preIn]);
        preIn++;

        if(startIn==endIn) return tNode;

        int index = map.get(tNode.data);

        tNode.left = buildTreeUtil(startIn, index-1, inorder, preorder, map);
        tNode.right = buildTreeUtil(index+1, endIn, inorder, preorder, map);
        return tNode;
    }

    public static Node buildTree(int inorder[], int preorder[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return buildTreeUtil(0, n-1, inorder, preorder, map);
    }
}
