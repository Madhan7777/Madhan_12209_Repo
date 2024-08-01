package com.madhan.restapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Room;

@Repository


public interface RoomRepo {

	String save(Room room);

	List<Room> findAll();

	String deleteById(int id);

	Room findById(int id);
}
