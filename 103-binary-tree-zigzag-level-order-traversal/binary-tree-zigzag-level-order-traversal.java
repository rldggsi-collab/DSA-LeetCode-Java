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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q= new ArrayDeque<>();
        q.add(root);
        boolean lefttoright = true;
        while(!q.isEmpty()){
            int lev = q.size();
            List<Integer> list = new ArrayList<>();
            while(lev>0){
                lev--;
                TreeNode t = q.peek();
                q.remove();

                if(lefttoright){
                        list.add(t.val);
                    }else{
                        list.add(0,t.val);
                    }
               
                     if(t.left!=null){
                        q.add(t.left);
                    }
                    if(t.right!=null){
                        q.add(t.right);
                    }
            
            }
            res.add(list);
            lefttoright=!lefttoright;
        }
        return res;
    }
}