import java.util.ArrayList;
import java.util.List;

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
class KthSmallestBST {
    List arr = new ArrayList();
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        return (int) this.arr.get(k-1);
    }

    public void helper(TreeNode node){
        if(node==null){
            return;
        }
        helper(node.left);
        this.arr.add(node.val);
        helper(node.right);

    }
}