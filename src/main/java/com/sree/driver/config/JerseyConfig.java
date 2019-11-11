package com.sree.driver.config;



import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import static com.sree.driver.config.Constant.Package_controllers;
@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		packages(Package_controllers);
	}
}
