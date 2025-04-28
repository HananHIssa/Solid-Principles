package javaapplication206;
public class SortedArrayToBST {
    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return convertToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode convertToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convertToBST(nums, left, mid - 1);
        node.right = convertToBST(nums, mid + 1, right);
        
        return node;
    }

    // Helper function to print the tree in order (for testing purposes)
    public static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};
        TreeNode bstRoot = sortedArrayToBST(arr);
        printInOrder(bstRoot);  
    }
}

