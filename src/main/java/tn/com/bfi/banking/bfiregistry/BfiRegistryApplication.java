package tn.com.bfi.banking.bfiregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BfiRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BfiRegistryApplication.class, args);
	}

}
