package org.alberthsuu.datastructurealgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 */
public class BinaryTreeInorderTraversal {
    private final List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null || root.val == null) return;

        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }
}
