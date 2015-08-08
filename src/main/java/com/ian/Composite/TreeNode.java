package com.ian.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian on 15/06/2015.
 */
public abstract class TreeNode {
    private String name;
    private TreeNode child;
    private List<TreeNode> list = new ArrayList<TreeNode>();

    public List<TreeNode> getList() {
        return list;
    }

    public void setList(List<TreeNode> list) {
        this.list = list;
    }

    public TreeNode(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChild(TreeNode child) {
        this.child = child;
    }

    public abstract void add(TreeNode node);

    public abstract void remove();

    public abstract TreeNode getChild();
}
