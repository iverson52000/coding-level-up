package org.alberthsuu.datastructurealgorithm;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {

    @Test
    void binaryTreeInorderTraversalFirstTestCase() {
        Integer[] treeArray = {1, null, 2, 3};
//        Integer[] treeArray = {1};

        TreeNode root = TreeGenerator.fromArray(treeArray);

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);

        System.out.println(result);
    }
}