package com.cloud.skyme;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangfeng
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);//设置默认启动不加载banner
		app.run(args);
	}
}
