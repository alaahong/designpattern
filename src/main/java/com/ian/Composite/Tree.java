package com.ian.Composite;

/**
 * Created by Ian on 15/06/2015.
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        this.root = new LeafNode(name);
    }

    public TreeNode getRoot() {
        return root;
    }
}
