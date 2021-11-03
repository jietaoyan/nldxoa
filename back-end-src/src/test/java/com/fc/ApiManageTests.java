package com.fc;


import com.fc.v2.iotmanage.service.IAPIManage;
import com.fc.v2.iotmanage.service.ISpaceManage;
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

}
