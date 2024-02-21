package org.alberthsuu.datastructurealgorithm;

import org.alberthsuu.datastructurealgorithm.common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null || root.val == null) return "#";

        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));

        return dfs(q);
    }

    private TreeNode dfs(Queue<String> q) {
        String s = q.poll();
        if (s.equals("#")) return null;

        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = dfs(q);
        root.right = dfs(q);

        return root;
    }


}
