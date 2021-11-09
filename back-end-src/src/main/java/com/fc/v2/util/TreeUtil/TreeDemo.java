package com.fc.v2.util.TreeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class TreeDemo {

    public List<TreeNode> getDeptTree(List<TreeNode> depts) {
        List<TreeNode> treeList = depts.stream()
                .filter(dept -> dept.getId()!=dept.getParentId())
                .map(dept -> {
                    TreeNode node = new TreeNode();
                    node.setId(dept.getId());
                    node.setParentId(dept.getParentId());
                    node.setName(dept.getName());
                    return node;
                }).collect(Collectors.toList());
        return TreeUtil.bulid(treeList, 0);
    }
}
