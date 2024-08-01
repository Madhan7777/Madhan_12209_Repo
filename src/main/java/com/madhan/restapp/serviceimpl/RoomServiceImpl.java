package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Room;
import com.madhan.restapp.repository.RoomRepo;

@Service
public class RoomServiceImpl {

	@Autowired
	RoomRepo repo;
	
	public String addRoom(Room room) {
		return(repo.save(room));
	}

	public Room getRoom(int id) {
		return repo.findById(id);	}

	public List<Room> getAllRoom() {
		return repo.findAll();
	}

	public String updateRoom(Room room) {
		return(repo.save(room));

	}

	public String deleteRoom(int id) {
		return(repo.deleteById(id));
		
	}

}
