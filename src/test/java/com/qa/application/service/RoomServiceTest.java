package com.qa.application.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.application.domain.Room;
import com.qa.application.repo.RoomRepo;




@RunWith(MockitoJUnitRunner.class)
public class RoomServiceTest {
//The class i will be testing
	@InjectMocks
	RoomService service;
//The class i will be mocking
	@Mock
	private RoomRepo repo;

	@Test
	public void createTest() {
		Room input = new Room("Double", 500.00, "Rob Robson");
		Room output = new Room(1L, "Double", 500.00, "Rob Robson");

		// mocking the output from RecordRepo class
		Mockito.when(this.repo.saveAndFlush(input)).thenReturn(output);

		assertEquals(output, this.service.addRoom(input));

		Mockito.verify(this.repo, Mockito.times(1)).saveAndFlush(input);
	}

	@Test
	public void readAllRoomTest() {

		List<Room> output = Arrays.asList(new Room(1L, "Double", 500.00, "Rob Robson" ), new Room(2L, "Double", 600.00, "Bob Bobson"));

		// mocking the output from PersonRepo class
		Mockito.when(this.repo.findAll()).thenReturn(output);

		assertEquals(output, this.service.readAll());

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
	}

	@Test
	public void readIdTest() {

		Room input = new Room(1L, "Double", 500.00, "Rob Robson");
		// mocking the output from RoomRepo class
		Mockito.when(this.repo.findById(1L)).thenReturn(Optional.of(input));

		assertEquals(input, this.service.read(1L));

		Mockito.verify(this.repo, Mockito.times(1)).findById(1L);
	}

	@Test
	public void deleteIdSuccesTest() {

		Mockito.when(this.repo.existsById(1L)).thenReturn(true, false);

		assertTrue(this.service.delete(1L));

		Mockito.verify(this.repo, Mockito.times(1)).deleteById(1L);
		Mockito.verify(this.repo, Mockito.times(2)).existsById(1L);

	}
//	@Test(expected = RoomNotFoundException.class)
//	public void deleteIdFailTest() {
//
//		Mockito.when(this.repo.existsById(1L)).thenReturn(false);
//		this.service.delete(1L);
//
//		Mockito.verify(this.repo, Mockito.times(0)).deleteById(1L);
//		Mockito.verify(this.repo, Mockito.times(0)).existsById(1L);
//	}

	
	@Test
	public void UpdateIdSuccesTest() {
	
		Room input = new Room(1L, "Double", 500.00, "Rob Robson");
		Long id =1L;
		
		// mocking the output from PersonRepo class
		Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(input));
		Mockito.when(this.repo.saveAndFlush(input)).thenReturn(input);
		
		assertEquals(this.repo.saveAndFlush(input), this.service.update(input,id));

		Mockito.verify(this.repo, Mockito.times(1)).findById(id);
		Mockito.verify(this.repo, Mockito.times(2)).saveAndFlush(input);
		
	}
	


}