package medium.ConstructBinaryTreeFromPreorderAndPostorderTraversal;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private int index = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Map<Integer, Integer> postOrderPosition = new HashMap<>();
        for (int i = 0; i < postorder.length; ++i) {
            postOrderPosition.put(postorder[i], i);
        }
        return construct(preorder, postOrderPosition, 0, preorder.length - 1);
    }

    private TreeNode construct(int[] preorder, Map<Integer, Integer> postOrderPosition, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[index++]);
        if (start == end) {
            return node;
        }
        int position = postOrderPosition.get(preorder[index]);
        node.left = construct(preorder, postOrderPosition, start, position);
        node.right = construct(preorder, postOrderPosition, position + 1, end - 1);
        return node;
    }
}
