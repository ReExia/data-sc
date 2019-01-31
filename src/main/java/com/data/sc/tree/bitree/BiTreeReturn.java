package com.data.sc.tree.bitree;

/**
 * biTree 递归
 */
public class BiTreeReturn {

    public BiTreeNode root;

    public BiTreeReturn(BiTreeNode root) {
        this.root = root;
    }

    /**
     * 先序遍历 根 左 右
     */
    public void preOrder(BiTreeNode root){
        //访问根结点
        visitNode(root);
        //先序遍历左子树
        preOrder(root.leftChild);
        //先序遍历右子树
        preOrder(root.rightChild);
    }

    /**
     * 中序遍历 左 根 右
     * @param root
     */
    public void inOrder(BiTreeNode root){
        //中序遍历根结点
        inOrder(root.leftChild);
        //访问左子树
        visitNode(root);
        //中序遍历右子树
        inOrder(root.rightChild);
    }

    /**
     * 后序遍历 左 右 根
     * @param root
     */
    public void postOrder(BiTreeNode root){
        //后序遍历左子树
        postOrder(root.leftChild);
        //后序遍历右子树
        postOrder(root.rightChild);
        //访问根结点
        visitNode(root);
    }



    /**
     * 打印结点值
     * @param node
     */
    private void visitNode(BiTreeNode node){
        System.out.printf(String.format("[%s]", node.data + ""));
    }
}
