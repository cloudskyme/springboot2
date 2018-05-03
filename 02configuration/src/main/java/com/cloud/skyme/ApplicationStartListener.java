/**
 * 
 */
package com.cloud.skyme;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author zhangfeng
 *
 */
public class ApplicationStartListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		System.out.println("我的父容器为：" + contextRefreshedEvent.getApplicationContext().getParent());
        System.out.println("初始化时我被调用了。");
	}

}
