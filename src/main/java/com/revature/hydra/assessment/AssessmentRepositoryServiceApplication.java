package com.revature.hydra.assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EntityScan("com.revature.beans")
public class AssessmentRepositoryServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AssessmentRepositoryServiceApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner runner() {
//		return args -> {
//			System.out.println(acs.findByBatchIdAndWeek(2050, (short) 7));
//		};
//	}

}
