package com.revature.hydra.assessment.integration;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;

public class AssessmentEndPointsTest {
	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;

	private Gson gson;

	private static final String ADDRESS = "http://35.182.214.189";
	private static final String PORT = "8081";

	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
		gson = new Gson();
	}

	
}
