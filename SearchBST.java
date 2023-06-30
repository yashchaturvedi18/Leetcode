import java.util.Stack;

public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {


        Stack<TreeNode> stack  = new Stack<TreeNode>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node =stack.pop();
            if(node.val==val){
                return  node;
            }
            stack.add(node.left);
            stack.add(node.right);
        }
        return null;

    }

}
