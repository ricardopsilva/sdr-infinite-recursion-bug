package com.studies.boot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.hateoas.MediaTypes;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = Application.class)
public class BookIntegrationTests {
	
	protected @Autowired WebApplicationContext context;
	protected MockMvc mvc;


	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	
	@Test
	public void listAllBooksJsonSchema() throws Exception {

		mvc.perform(get("/books").header("Accept", "application/schema+json")).
				andDo(MockMvcResultHandlers.print()).
				andExpect(status().isOk()).
				andExpect(content().contentType("application/schema+json"));
	}
	

	@Test
	public void listAllBooksAlps() throws Exception {

		mvc.perform(get("/books")).
				andDo(MockMvcResultHandlers.print()).
				andExpect(status().isOk()).
				andExpect(content().contentType(MediaTypes.HAL_JSON));
	}
	
	

}
