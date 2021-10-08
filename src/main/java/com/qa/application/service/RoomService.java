package com.qa.application.service;

import java.util.List;

//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.qa.application.exception.RoomNotFoundException;
import com.qa.application.domain.Room;
import com.qa.application.repo.RoomRepo;


@Service
//@Repository

public class RoomService {
	
	
	private RoomRepo repo;
	
	public RoomService(RoomRepo repo) {
		super();
		this.repo = repo;
		
	}
	
	//Create
	//creating 
	public Room addRoom(Room room) {
		return this.repo.saveAndFlush(room);
	}

	//Read All
	public List<Room> readAll(){
		return this.repo.findAll();
		}

	//Read Id
	public Room read(Long id) {
		return this.repo.findById(id).get();
		}
	
	//Update
	public Room update(Room room, Long id) {
		Room exists = this.repo.findById(id).orElseThrow(RoomNotFoundException::new);
		exists.setRoomType(room.getRoomType());
		exists.setRoomRent(room.getRoomRent());
		exists.setRoomOccupant(room.getRoomOccupant());
		return this.repo.saveAndFlush(exists);
		
	}
	
	//Delete
	
	public Boolean delete(Long id) {
		if(!this.repo.existsById(id)) {
			throw new RoomNotFoundException();
		}
		 this.repo.deleteById(id);
	        
	        return !this.repo.existsById(id);
	        
		
	}
}

	





