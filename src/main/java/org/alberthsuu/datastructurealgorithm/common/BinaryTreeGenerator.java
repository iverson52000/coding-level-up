package org.alberthsuu.datastructurealgorithm.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeGenerator {
    public static @Nullable TreeNode fromArray(Integer @NotNull [] treeArray) {
        if (treeArray.length == 0) return null;

        TreeNode root = new TreeNode(treeArray[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        for (int i = 1; i < treeArray.length; i++) {
            TreeNode node = q.peek();
            assert node != null;
            if (node.left == null) {
                node.left = new TreeNode(treeArray[i]);
                if (treeArray[i] != null) q.add(node.left);
            } else if (node.right == null) {
                node.right = new TreeNode(treeArray[i]);
                if (treeArray[i] != null) q.add(node.right);
                q.remove();
            }
        }

        return root;
    }


}
