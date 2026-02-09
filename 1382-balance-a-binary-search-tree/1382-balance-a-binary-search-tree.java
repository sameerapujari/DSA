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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> a = new ArrayList<>();
        inorder(root,a);
        return buildBst(a,0,a.size()-1);
    }
    private void inorder(TreeNode root, List<Integer>a){
        if(root==null) return;
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
    private TreeNode buildBst(List<Integer>a,int l, int h){
        if(l>h) return null;
        int m = l+(h-l)/2;
        TreeNode r = new TreeNode(a.get(m));
        r.left = buildBst(a,l,m-1);
        r.right = buildBst(a,m+1,h);
        return r;
    }
}