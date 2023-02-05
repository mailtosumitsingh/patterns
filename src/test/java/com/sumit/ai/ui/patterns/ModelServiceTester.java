package com.sumit.ai.ui.patterns;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ModelServiceTester {
	@LocalServerPort
	private int port;
	@Test
	public void testModelService() {
		
	}
	@Autowired
	private PatternsController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void modelShouldReturnCycle() throws Exception {
		Model m = new Model();
		m.addPoint(new Point(0,0,"1"));
		m.addPoint(new Point(0,1,"2"));
		m.addPoint(new Point(0,2,"3"));
		m.addPoint(new Point(0,3,"4"));
		m.addPoint(new Point(0,0,"1"));
		List<List<Point>> loops = (this.restTemplate.postForObject("http://localhost:"+port + "/getCycles",m,List.class));
		System.out.println(loops);
	}
}
