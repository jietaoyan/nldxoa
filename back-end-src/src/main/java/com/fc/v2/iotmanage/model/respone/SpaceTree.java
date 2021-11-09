package com.fc.v2.iotmanage.model.respone;

import com.fc.v2.util.TreeUtil.TreeNode;
import lombok.Data;

@Data
public class SpaceTree extends TreeNode {

    private int spaceId;
    private String spaceName;
    private String spaceIdV;
}
