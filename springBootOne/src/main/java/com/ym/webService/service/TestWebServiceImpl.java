package com.ym.webService.service;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by Administrator on 2018/11/2 0002.
 */
@WebService(//serviceName = "TestWebService", // 与接口中指定的name一致
targetNamespace = "http://service.webService.ym.com", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "com.ym.webService.service.TestWebService"// 接口地址
 )
@Component
public class TestWebServiceImpl implements TestWebService{
    @Override
    public String sendMessage(String username) {

        return "hello "+username;
    }
}
