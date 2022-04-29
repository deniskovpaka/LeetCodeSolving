package easy.ConvertSortedArrayToBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[] {-10, -3, 0, 5, 9};
        Solution solution = new Solution();
        TreeNode treeNode = solution.sortedArrayToBST(input);
        System.out.println("+");
    }
}

