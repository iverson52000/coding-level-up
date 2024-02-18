package org.alberthsuu.datastructurealgorithm;

import org.alberthsuu.datastructurealgorithm.common.BinaryTreeGenerator;
import org.alberthsuu.datastructurealgorithm.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;


class BinaryTreeTraversalTest {
    private BinaryTreeTraversal binaryTreeTraversal;

    @BeforeEach
    void setUp() {
        binaryTreeTraversal = new BinaryTreeTraversal();
    }

    @Test
    void binaryTreeInorderDfsTraversalFirstTestCase() {
        Integer[] treeArray = {1, null, 2, 3};
        TreeNode root = BinaryTreeGenerator.fromArray(treeArray);

        List<Integer> result = binaryTreeTraversal.inorderDfsTraversal(root);

        List<Integer> expectedResult = List.of(1, 3, 2);

        assertIterableEquals(result, expectedResult);
    }

    @Test
    void binaryTreeInorderDfsTraversalEmptyInput() {
        Integer[] treeArray = {};
        TreeNode root = BinaryTreeGenerator.fromArray(treeArray);

        List<Integer> result = binaryTreeTraversal.inorderDfsTraversal(root);

        List<Integer> expectedResult = new ArrayList<>();

        assertIterableEquals(result, expectedResult);
    }

    @Test
    void binaryTreeBfsTraversalFirstTestCase() {
        Integer[] treeArray = {3, 9, 20, null, null, 15, 7};
        TreeNode root = BinaryTreeGenerator.fromArray(treeArray);

        List<List<Integer>> result = binaryTreeTraversal.bfsTraversal(root);

        List<List<Integer>> expectedResult = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );


        assertIterableEquals(result, expectedResult);
    }


}