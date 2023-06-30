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
class subTreeOfAnotherTree {
    public boolean isSubtree(TreeNode T, TreeNode S) {
        if (S == null)
            return true;

        if (T == null)
            return false;

        /* Check the tree with root as current node */
        if (areIdentical(T, S))
            return true;

        /* If the tree with root as current node doesn't
           match then
           try left and right subtrees one by one */
        return isSubtree(T.left, S)
                || isSubtree(T.right, S);

    }

    public boolean areIdentical(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null && node2!=null){
            return false;
        }
        if(node1!=null && node2==null){
            return false;
        }
        if(node1.val != node2.val){
            return false;
        }
        return areIdentical(node1.left,node2.left) && areIdentical(node1.right, node2.right);


    }
}