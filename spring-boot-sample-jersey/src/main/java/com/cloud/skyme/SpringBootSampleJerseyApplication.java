package com.cloud.skyme;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * spring boot Jersey示例
 * @author zhangfeng
 *
 */
@SpringBootApplication
public class SpringBootSampleJerseyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new SpringBootSampleJerseyApplication()
				.configure(new SpringApplicationBuilder(SpringBootSampleJerseyApplication.class))
				.run(args);
	}

}