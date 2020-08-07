package easy.MergeTwoBinaryTrees;

import easy.FindModeInBinarySearchTree.TreeNode;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t2 == null) {
            return t1;
        } else if (t1 == null) {
            return t2;
        } else {
            return merge(t1, t2);
        }
    }

    /*
    Like this solution
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
    * */
    private TreeNode merge(TreeNode t1, TreeNode t2) {
        TreeNode res = new TreeNode();
        res.val += t1.val;
        res.val += t2.val;

        if (t1.left != null && t2.left != null) {
            res.left = merge(t1.left, t2.left);
        } else if (t1.left == null && t2.left != null) {
            res.left = merge(new TreeNode(), t2.left);
        } else if (t1.left != null) {
            res.left = merge(t1.left, new TreeNode());
        }

        if (t1.right != null && t2.right != null) {
            res.right = merge(t1.right, t2.right);
        } else if (t1.right == null && t2.right != null) {
            res.right = merge(new TreeNode(), t2.right);
        } else if (t1.right != null) {
            res.right = merge(t1.right, new TreeNode());
        }

        return res;
    }

    public static void main(String[] args) {
//        TreeNode t5 = new TreeNode(5);
//        TreeNode t3 = new TreeNode(3, t5, null);
//        TreeNode t2 = new TreeNode(2);
//        TreeNode t1 = new TreeNode(1, t3, t2);
//
//        TreeNode t44 = new TreeNode(4);
//        TreeNode t77 = new TreeNode(7);
//        TreeNode t11 = new TreeNode(1, null, t44);
//        TreeNode t33 = new TreeNode(3, null, t77);
//        TreeNode t22 = new TreeNode(2, t11, t33);
//        TreeNode res = new Solution().mergeTrees(t1, t22);

        TreeNode res = new Solution().mergeTrees(new TreeNode(1), null);
        System.out.println("Res = ");
    }
}
