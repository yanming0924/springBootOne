package com.ym;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
// Spring Boot 应用的标识
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.ym.dao")
public class SpringBootOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneApplication.class, args);
	}
}
