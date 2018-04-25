/******************************************************************
 *
 *    Copyright (c) 2015-2017 Digital Telemedia Co.,Ltd
 *    http://www.zqlwl.com/
 *
 *    Package:     com.cloud.skyme
 *
 *    Filename:    Example.java
 *
 *    Description: spring boot 2示例
 *
 *    Copyright:   Copyright (c) 2015-2017
 *
 *    Company:     青旅物流集团
 *
 *    @author:     zhangfeng
 *
 *    @version:    1.0.0
 *
 *    Create at:   2018年4月25日 上午10:53:24
 *
 *    Revision:
 *
 *    2018年4月25日 上午10:53:24
 *        - first revision
 *
 *****************************************************************/
package com.cloud.skyme;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Example
 * @Description spring boot 2示例
 * @author zhangfeng
 * @Date 2018年4月25日 上午10:53:24
 * @version 1.0.0
 */
@RestController
@EnableAutoConfiguration
public class Example {
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
