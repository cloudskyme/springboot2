/**
 * 
 */
package com.cloud.skyme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangfeng
 *
 */
public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);

		TestBean tb = (TestBean) context.getBean("testBean");
		tb.sayHello();
		System.out.println(tb);

		TestBean tb2 = (TestBean) context.getBean("testBean");
		tb2.sayHello();
		System.out.println(tb2);
	}

}
