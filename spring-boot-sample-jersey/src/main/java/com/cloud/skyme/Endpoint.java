/**
 * 
 */
package com.cloud.skyme;

/**
 * @author zhangfeng
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class Endpoint {

	private final Service service;

	public Endpoint(Service service) {
		this.service = service;
	}

	@GET
	public String message() {
		return "Hello " + this.service.message();
	}

}
