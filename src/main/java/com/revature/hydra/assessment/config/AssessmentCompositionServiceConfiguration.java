package com.revature.hydra.assessment.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.hydra.assessment.repository.AssessmentRepository;
import com.revature.hydra.assessment.service.AssessmentCompositionService;

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

	// @Bean
	// public CommandLineRunner runner() {
	// return args -> {
	// Assessment assessment = assessmentCompositionService.findOne((long) 5175);
	//
	// System.out.println(assessment);
	// };
	// }
}