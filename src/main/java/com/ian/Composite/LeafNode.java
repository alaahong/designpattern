package com.ian.Composite;

/**
 * Created by Ian on 15/06/2015.
 */
public class LeafNode extends TreeNode {
    public LeafNode(String name) {
        super(name);
    }

    @Override
    public void add(TreeNode node) {
        this.getList().add(node);
    }

    @Override
    public void remove() {
        if (this.getList().size() > 0) this.getList().remove(this.getList().size() - 1);
    }

    @Override
    public TreeNode getChild() {
        return this.getChild();
    }
}
