package easy.ConvertSortedArrayToBinarySearchTree;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createNode(nums, 0, nums.length - 1);
    }

    private TreeNode createNode(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        if (left == right) {
            return new TreeNode(nums[left]);
        }
        int middle = (right + left) / 2;
        TreeNode root = new TreeNode(nums[middle]);;
        root.right = createNode(nums, middle + 1, right);
        root.left = createNode(nums, left, middle - 1);
        return root;
    }
}
