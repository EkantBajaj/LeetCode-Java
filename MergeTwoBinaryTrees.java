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
class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1!=null && t2!=null){
            add(t1,t2);
            return t1;}
        else if(t1==null && t2!=null)
            return t2;
        return t1;
    }
    
    public void add(TreeNode t1 , TreeNode t2) {
        if (t1!=null && t2!=null){
            
            t1.val += t2.val;
            if (t1.left==null && t2.left!=null)
                t1.left = t2.left;
            else
                add(t1.left,t2.left);
            if (t1.right == null && t2.right!=null)
                t1.right = t2.right;
            else
                add(t1.right,t2.right);}
        else if(t1!=null && t2==null)
            return ;
        
    }
}
