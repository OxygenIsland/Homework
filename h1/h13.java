package day06;

public class h13 {
}
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
class Solution3 {

    // 全局变量max
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    // helper returns the max branch
    // plus current node's value
    int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 计算左子树和的最大值（如果为负数的话就不取左子树的和）
        int left = Math.max(helper(root.left), 0);

        // 计算右子树和的最大值（如果为负数的话就不取右子树的和）
        int right = Math.max(helper(root.right), 0);

        // 计算加上当前节点数据后的和的最大值（如果加上当前节点后反而比之前的最大值小，比如当前节点是负数，则不取当前节点）
        max = Math.max(max, root.val + left + right);

        // 返回经过当前节点路径的最大值
        return root.val + Math.max(left, right);
    }
}