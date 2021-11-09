package com.fc;


import com.fc.v2.iotmanage.mapper.SpaceInfoMapper;
import com.fc.v2.iotmanage.model.respone.SpaceInfo;
import com.fc.v2.iotmanage.model.respone.SpaceTree;
import com.fc.v2.iotmanage.service.IAPIManage;
import com.fc.v2.iotmanage.service.ISpaceManage;
import com.fc.v2.util.TreeUtil.TreeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiManageTests {


    @Autowired
    public IAPIManage iAPIManage;


    @Test
    public void main() throws Exception{
        RestTemplate restTemplate = new RestTemplate();

    }

    @Autowired
    ISpaceManage iSpaceManage;
    @Test
    public void testSpace (){
        iSpaceManage.getSpace();
    }

    @Autowired
    private SpaceInfoMapper spaceInfoMapper;
    @Test
    public void treeTest(){

        List<SpaceInfo> list= spaceInfoMapper.selectByExample(null);

        List<SpaceTree> treeList = list.stream()
                .filter(dept -> dept.getSpaceId()!=dept.getParentId())
                .map(dept -> {
                    SpaceTree node = new SpaceTree();
                    node.setSpaceId(dept.getSpaceId());
                    node.setId(dept.getSpaceId());
                    node.setParentId(dept.getParentId());
                    node.setSpaceName(dept.getSpaceName());
                    return node;
                }).collect(Collectors.toList());

        System.out.println(treeList);
        System.out.println(TreeUtil.bulid(treeList, 1));
    }

}
