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
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
                TreeNode t = q.peek();
                q.remove();

                list.add(t.val);
                if(t.right != null){
                    q.add(t.right);
                }
                if(t.left != null){
                    q.add(t.left);
                }
                TreeNode temp = t.left;
                t.left = t.right;
                t.right = temp;
        }
        return root;
    }
}