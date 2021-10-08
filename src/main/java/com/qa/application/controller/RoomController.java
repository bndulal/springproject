//package com.qa.application.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.qa.application.domain.Room;
//import com.qa.application.service.RoomService;
//
//
//
//
//@RequestMapping
//@RestController
//public class RoomController {
//	
//	@Autowired
//	private RoomService service;
//	
//	public RoomController(RoomService service) {
//		super();
//		this.service = service;
//		
//	}
//
//	@GetMapping("/test")
//	public String test() {
//		return "Hey! How u doin ?";
//	}
//
//	//CRUD methods
//	@PostMapping("/create")
//	public ResponseEntity<Room> create(@RequestBody Room room){
//		
//		return new ResponseEntity<Room>(this.service.addRoom(room), HttpStatus.CREATED);
//		
//		}
////	
////	
//	//read 
//	
//	@GetMapping("/read")
//	public ResponseEntity<List<Room>> readAll(){
//    	return new ResponseEntity<List<Room>>(this.service.readAll(), HttpStatus.OK);
//    	 }
//	
//	
//	 //read id
//    @GetMapping("/read/{id}")
//    public ResponseEntity<Room> read(@PathVariable Long id){
//    	return new ResponseEntity<Room>(this.service.read(id), HttpStatus.OK);
//    	 }
//	
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Room> update(@PathVariable Long id, @RequestBody Room room){
//		return new ResponseEntity<Room>(this.service.update(room, id), HttpStatus.ACCEPTED);
//    	}
//    
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Boolean> delete(@PathVariable long id){
//        return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
//    }
//    
//}
