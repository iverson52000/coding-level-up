package org.alberthsuu.datastructurealgorithm;

import org.alberthsuu.datastructurealgorithm.common.BinaryTreeGenerator;
import org.alberthsuu.datastructurealgorithm.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SerializeAndDeserializeBinaryTreeTest {
    private SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree;

    @BeforeEach
    void setUp() {
        serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();
    }

    @Test
    void SerializeAndDeserializeBinaryTreeFirstTestCase() {
        Integer[] treeArray = {1, 2, 3, null, null, 4, 5};
        TreeNode root = BinaryTreeGenerator.fromArray(treeArray);

        String data = serializeAndDeserializeBinaryTree.serialize(root);
        TreeNode deserializedRoot = serializeAndDeserializeBinaryTree.deserialize(data);

        Integer[] result = BinaryTreeGenerator.toArray(deserializedRoot);
        Integer[] expectedResult = {1, 2, 3, null, null, 4, 5, null, null, null, null};

        assertArrayEquals(result, expectedResult);

    }

    @Test
    void SerializeAndDeserializeBinaryTreeEmptyInput() {
        Integer[] treeArray = {};
        TreeNode root = BinaryTreeGenerator.fromArray(treeArray);

        String data = serializeAndDeserializeBinaryTree.serialize(root);
        TreeNode deserializedRoot = serializeAndDeserializeBinaryTree.deserialize(data);

        Integer[] result = BinaryTreeGenerator.toArray(deserializedRoot);
        Integer[] expectedResult = {};

        assertArrayEquals(result, expectedResult);

    }
}