//package com.qa.application.domain;
//
//import java.util.Objects;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
////import javax.persistence.Table;
//
////import org.springframework.data.domain.Example;
////import org.springframework.data.domain.Page;
////import org.springframework.data.domain.Pageable;
////import org.springframework.data.domain.Sort;
//
//
//@Entity
//public class Room{
//	  @Id
//	  @GeneratedValue(strategy=GenerationType.IDENTITY)
//	    private Long id; 
//	  
//	    private String roomType;
//	    
//	    private Double roomRent;
//	    
//	    private String roomOccupant;
//
//		public Room(Long id, String roomType, Double roomRent, String roomOccupant) {
//			super();
//			this.id = id;
//			this.roomType = roomType;
//			this.roomRent = roomRent;
//			this.roomOccupant = roomOccupant;
//		}
//
//		public Room(String roomType, Double roomRent, String roomOccupant) {
//			super();
//			this.roomType = roomType;
//			this.roomRent = roomRent;
//			this.roomOccupant = roomOccupant;
//		}
//
//		public Room() {
//			super();
//		}
//
//		public Long getId() {
//			return id;
//		}
//
//		public void setId(Long id) {
//			this.id = id;
//		}
//
//		public String getRoomType() {
//			return roomType;
//		}
//
//		public void setRoomType(String roomType) {
//			this.roomType = roomType;
//		}
//
//		public Double getRoomRent() {
//			return roomRent;
//		}
//
//		public void setRoomRent(Double roomRent) {
//			this.roomRent = roomRent;
//		}
//
//		public String getRoomOccupant() {
//			return roomOccupant;
//		}
//
//		public void setRoomOccupant(String roomOccupant) {
//			this.roomOccupant = roomOccupant;
//		}
//
//		@Override
//		public String toString() {
//			return "Room [id=" + id + ", roomType=" + roomType + ", roomRent=" + roomRent + ", roomOccupant="
//					+ roomOccupant + "]";
//		}
//
//		@Override
//		public int hashCode() {
//			return Objects.hash(id, roomOccupant, roomRent, roomType);
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Room other = (Room) obj;
//			return Objects.equals(id, other.id) && Objects.equals(roomOccupant, other.roomOccupant)
//					&& Objects.equals(roomRent, other.roomRent) && Objects.equals(roomType, other.roomType);
//		}
//}
//			   