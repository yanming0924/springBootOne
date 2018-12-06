package com.ym.webService.service;

import javax.jws.WebService;

/**
 * Created by Administrator on 2018/11/2 0002.
 */
@WebService(serviceName = "TestService", // 与接口中指定的name一致
targetNamespace = "http://service.ym.com", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "com.ym.webService.service.TestService"// 接口地址
 )
public class TestWebServiceImpl implements TestWebServiceImpl {
    @Override
    public String sendMessage(String username) {

        return "hello "+username;
    }
}
