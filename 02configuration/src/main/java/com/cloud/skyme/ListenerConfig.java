/**
 * 
 */
package com.cloud.skyme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangfeng
 *
 */
@Configuration
public class ListenerConfig {
	
	@Bean
    public ApplicationStartListener applicationStartListener(){
        return new ApplicationStartListener();
    }

}
