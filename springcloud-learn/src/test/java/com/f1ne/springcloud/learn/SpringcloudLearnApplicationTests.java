package com.f1ne.springcloud.learn;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.f1ne.springcloud.learn.controller.HelloSpringCloudController;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringcloudLearnApplicationTests {
    private MockMvc mvc;
    
    @Before
    public void setUp(){
        mvc = MockMvcBuilders.standaloneSetup(new HelloSpringCloudController()).build();
    }

	@Test
	public void contextLoads() throws Exception {
	    mvc.perform(MockMvcRequestBuilders.get("/hello")).andExpect(content().string(equalTo("hello world spring cloud!")));
	}

}
