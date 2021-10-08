package com.qa.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.application.domain.Room;


@Repository
public interface RoomRepo extends JpaRepository<Room, Long>{


}
