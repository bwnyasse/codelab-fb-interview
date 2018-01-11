package symmetry;

public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isEqualNode(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }

        return true;
    }

    public int isSymmetric(TreeNode root) {
        boolean value = isEqualNode(root.left,root.right) && isEqualNode(root.right, root.left);
        return value == true ? 1 : 0;
    }


}
