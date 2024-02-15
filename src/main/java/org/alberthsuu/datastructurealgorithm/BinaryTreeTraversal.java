package org.alberthsuu.datastructurealgorithm;

import org.alberthsuu.datastructurealgorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 94. Binary Tree Inorder Traversal and 102. Binary Tree Level Order Traversal.
 */
public class BinaryTreeTraversal {
    private final List<Integer> dfsRes = new ArrayList<>();

    public List<Integer> inorderDfsTraversal(TreeNode root) {
        inorderDfs(root);
        return dfsRes;
    }

    public List<List<Integer>> bfsTraversal(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) return res;

        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> path = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode peekNode = q.peek();
                assert peekNode != null;
                if (peekNode.left != null) q.offer(peekNode.left);
                if (peekNode.right != null) q.offer(peekNode.right);

                TreeNode pollNode = q.poll();
                assert pollNode != null;
                if (pollNode.val != null) path.add(pollNode.val);

            }
            res.add(path);
        }

        return res;
    }

    private void inorderDfs(TreeNode root) {
        if (root == null || root.val == null) return;

        inorderDfs(root.left);
        dfsRes.add(root.val);
        inorderDfs(root.right);
    }
}
