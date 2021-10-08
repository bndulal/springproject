//package com.qa.application.controller;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.qa.application.domain.Room;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//@Sql(scripts = {"classpath:testschema.sql", "classpath:testdata.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
//@ActiveProfiles("test")
//public class RoomControllerIntegrationTest {
//	
//	@Autowired
//	private MockMvc mvc;
//	
//	@Autowired
//	private ObjectMapper mapper;
//	
//	@Test
//	public void createTest() throws Exception {
//		Room entry = new Room("Double", 500.00, "Rob Robson");
//		Room result = new Room(2L, "Double", 500.00, "Rob Robson");
//		
//		String entryAsJSON = this.mapper.writeValueAsString(entry);
//		String resultAsJSON = this.mapper.writeValueAsString(result);
//		
//		mvc.perform(post("/create")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(entryAsJSON))
//				.andExpect(status().isCreated())
//				.andExpect(content().json(resultAsJSON));	
//	}
//	@Test
//	public void readAllTest() throws Exception {
//		List<Room> r1 = Arrays.asList(new Room(1L, "Double", 500.00, "Rob Robson"));
//	String entryAsJSON = this.mapper.writeValueAsString(r1);
//
//		mvc.perform(get("/read"))
//				.andExpect(status()
//				.isOk())
//				.andExpect(content()
//				.json(entryAsJSON));
//
//	}
//	@Test
//	public void readTest() throws Exception {
//		Room r1 = new Room(1L,"Double", 500.00, "Rob Robson");
//		String entryAsJSON = this.mapper.writeValueAsString(r1);
//
//		mvc.perform(get("/read/1")).andExpect(status().isOk()).andExpect(content().json(entryAsJSON));
//
//	}
//	@Test
//	public void updateTest() throws Exception {
//		Room r1 = new Room(1L, "Double", 500.00, "Rob Robson");
//		String entryAsJSON = this.mapper.writeValueAsString(r1);
//
//
//		mvc.perform(put("/update/1").contentType(MediaType.APPLICATION_JSON).content(entryAsJSON))
//				.andExpect(status().isAccepted()).andExpect(content().json(entryAsJSON));
//
//	}
//	
//	@Test
//	public void deleteSuccesTest() throws Exception {
//
//
//		mvc.perform(delete("/delete/1")).andExpect(status().isNoContent());
//
//	}
//	
//	
//	
//	
//}
