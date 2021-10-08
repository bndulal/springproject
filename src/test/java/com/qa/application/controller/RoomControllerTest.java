package com.qa.application.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import java.awt.PageAttributes.MediaType;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.application.domain.Room;
import com.qa.application.service.RoomService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class RoomControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@MockBean
	private RoomService service;

	@Test
	public void createTest() throws Exception{
		Room enter=new Room("Double", 500.00, "Rob Robson");
		String enterAsJSON=this.mapper.writeValueAsString(enter);
		Room output=new Room(1L,"Double", 500.00, "Rob Robson");
		String outputAsJSON=this.mapper.writeValueAsString(output);
	
		Mockito.when(this.service.addRoom(enter)).thenReturn(output);
	
		mvc.perform(post("/create")
				.contentType(MediaType.APPLICATION_JSON)
				.content(enterAsJSON))
				.andExpect(status().isCreated())
				.andExpect(content().json(outputAsJSON));
		
	}

	@Test
	public void readAllTest() throws Exception{
		List<Room> r1 = Arrays.asList(new Room(1L,"Double", 500.00, "Rob Robson" ), new Room(2L, "Double", 600.00, "Bob Bobson"));
		String enterAsJSON=this.mapper.writeValueAsString(r1);
	
		Mockito.when(this.service.readAll()).thenReturn(r1);

		mvc.perform(get("/read")).andExpect(status().isOk()).andExpect(content().json(enterAsJSON));

	}
	
	@Test
	public void readTest() throws Exception{
		Room r1=new Room("Double", 500.00, "Rob Robson");
		String enterAsJSON=this.mapper.writeValueAsString(r1);
	
		Mockito.when(this.service.read(1L)).thenReturn(r1);

		mvc.perform(get("/read/1")).andExpect(status().isOk()).andExpect(content().json(enterAsJSON));

	}
	@Test
	public void updateTest() throws Exception{
		Room r1=new Room("Double", 500.00, "Rob Robson");
		String enterAsJSON=this.mapper.writeValueAsString(r1);
	
		Mockito.when(this.service.update(r1,1L)).thenReturn(r1);

		mvc.perform(put("/update/1")
			.contentType(MediaType.APPLICATION_JSON)
			.content(enterAsJSON))
			.andExpect(status().isAccepted())
			.andExpect(content().json(enterAsJSON));

}

	@Test
	public void deleteSuccesTest() throws Exception{
	
		Mockito.when(this.service.delete(1L)).thenReturn(true);

		mvc.perform(delete("/delete/1")).andExpect(status().isNoContent());

	}
}



