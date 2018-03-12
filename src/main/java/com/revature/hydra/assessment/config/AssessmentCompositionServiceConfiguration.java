package com.revature.hydra.assessment.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.hydra.assessment.data.AssessmentRepository;
import com.revature.hydra.assessment.service.AssessmentCompositionService;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class AssessmentCompositionServiceConfiguration {
	@Autowired
	AssessmentCompositionService assessmentCompositionService;

	@Autowired
	AssessmentRepository assessmentRepository;

	@Bean
	public AmqpTemplate rabbitTemplate(ConnectionFactory factory) {
		return new RabbitTemplate(factory);
	}

	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.revature.hydra.assessment.controller"))              
          .paths(PathSelectors.any())                          
          .build();
    }
	// @Bean
	// public CommandLineRunner runner() {
	// return args -> {
	// Assessment assessment = assessmentCompositionService.findOne((long) 5175);
	//
	// };
	// }
}