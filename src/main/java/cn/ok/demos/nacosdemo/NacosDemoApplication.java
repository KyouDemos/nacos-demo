package cn.ok.demos.nacosdemo;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * File Header
 * PROJECT_NAME: nacos-demo
 * PACKAGE_NAME: cn.ok.demos.nacosdemo.web
 *
 * @author Kyou
 * @date 2018/12/7 23:13
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDemoApplication.class, args);
	}
}
