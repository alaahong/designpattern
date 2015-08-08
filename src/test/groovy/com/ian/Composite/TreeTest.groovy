package com.ian.Composite

import spock.lang.Specification

/**
 * Created by Ian on 15/06/2015.
 */
class TreeTest extends Specification {
    def "Tree Test"() {
        when: ""
        def tree = new Tree("Tree")
        tree.getRoot().add(new LeafNode("Leaf1"))
        tree.getRoot().add(new LeafNode("Leaf2"))
        tree.getRoot().add(new LeafNode("Leaf3"))
        tree.getRoot().getList().get(0).add(new LeafNode("Leaf4"))
        tree.getRoot().remove()
        then: ""
        tree.getRoot().getList().size() == 2
        tree.getRoot().getList().get(0).getName().equals("Leaf1")
        tree.getRoot().getList().get(1).getName().equals("Leaf2")
        tree.getRoot().getList().get(0).getList().get(0).getName().equals("Leaf4")
    }
}
