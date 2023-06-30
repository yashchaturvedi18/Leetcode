import java.util.*;

public class BinaryTreeLevelOrderTraversal {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> arr = new ArrayList<Integer>();
            for(int i = 0;i< n;i++){
                TreeNode last = queue.remove();
                arr.add(last.val);
                if(last.left!=null){
                    queue.add(last.left);
                }
                if(last.right!=null){
                    queue.add(last.right);
                }
            }
            res.add(arr);
        }



        return res;

    }
}
