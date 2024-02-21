package org.alberthsuu.datastructurealgorithm;

import org.alberthsuu.datastructurealgorithm.common.BinaryTreeGenerator;
import org.alberthsuu.datastructurealgorithm.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

//        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        Integer[] result = BinaryTreeGenerator.toArray(deserializedRoot);

        System.out.println(Arrays.toString(result));


    }
}