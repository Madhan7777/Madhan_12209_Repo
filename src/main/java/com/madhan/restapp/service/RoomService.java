package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Room;

public interface RoomService {
	
	public String addRoom(Room room) ;

	public List<Room> getAllRoom();

	public String updateRoom(Room room);

	public String deleteRoom(int id);
	
	public Room getRoom(int id) ;

}
