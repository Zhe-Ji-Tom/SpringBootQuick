package SpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringBoot.service.HelloService;

@Configuration
public class MyAppConfig {

	@Bean
	public HelloService helloService() {
		System.out.println("successful");
		return new HelloService();
	}
}
