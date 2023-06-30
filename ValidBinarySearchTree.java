import  java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class ValidBinarySearchTree {
    List<Integer> arr = new ArrayList<Integer>();

    public boolean isValidBST(TreeNode root) {
        boolean res = true;
        inorder(root);
        int prev = arr.get(0);
        for(int i = 1;i<arr.size();i++){
            if(prev>arr.get(i)){
                res = false;
                break;
            }
            prev=arr.get(i);
        }
        return res;
    }

    public void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        this.arr.add(node.val);
        inorder(node.right);
    }
}