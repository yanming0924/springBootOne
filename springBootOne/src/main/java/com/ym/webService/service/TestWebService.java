package com.ym.webService.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by Administrator on 2018/11/2 0002.
 */
@WebService//(name = "TestWebService" // 暴露服务名称
 //       targetNamespace = "http://service.webService.ym.com"// 命名空间,一般是接口的包名倒序
//)
public interface TestWebService {
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String sendMessage(@WebParam(name = "username") String username);
}
