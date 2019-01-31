package com.data.sc.tree.bitree;

/**
 * Bi树结点
 */
public class BiTreeNode {

    public Object data;

    public BiTreeNode leftChild;

    public BiTreeNode rightChild;

    public BiTreeNode() {
        this(null,null,null);
    }

    public BiTreeNode(Object data) {
        this(data,null,null);
    }

    public BiTreeNode(Object data, BiTreeNode leftChild, BiTreeNode rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
