package com.ym;


import com.ym.webService.service.TestWebService;
import com.ym.webService.service.TestWebServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2018/11/2 0002.
 */
@Configuration
public class TestConfig {
//    @Autowired
//    private Bus bus;
//    @Autowired
//    private TestWebService testWebService;
//    @Bean
//    public Endpoint endpoint(){
//        EndpointImpl endpoint = new EndpointImpl(bus, testWebService);//(bus,testWebService );
//        endpoint.publish("/TestWebService");
//        return endpoint;
//    }

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/test/*");
    }
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    @Bean public TestWebService testWebService(){
        return new TestWebServiceImpl();
    }
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), testWebService());
        endpoint.publish("/TestWebService");
        return endpoint;
    }
}
