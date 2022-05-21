package medium.ConstructBinaryTreeFromPreorderAndPostorderTraversal;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        // preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
        int[] preorder = new int[] {1,2,4,5,3,6,7};
        int[] postorder = new int[] {4,5,2,6,7,3,1};
        Solution solution = new Solution();
        TreeNode treeNode = solution.constructFromPrePost(preorder, postorder);
        System.out.println("");
    }
}
