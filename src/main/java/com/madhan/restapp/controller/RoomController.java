package com.madhan.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhan.restapp.model.Room;
import com.madhan.restapp.serviceimpl.RoomServiceImpl;

@RestController
@RequestMapping("/roomtable")
@CrossOrigin("*")
public class RoomController {
	
	@Autowired
	RoomServiceImpl service;

	@PostMapping
	public String insertRoom(@RequestBody Room room)
	{
		String msg="";
		try {
			service.addRoom(room);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	@GetMapping("{id}")
	public Room getRoomById(@PathVariable("id") int id)
	{
	return service.getRoom(id);
}
	

	
	
	@GetMapping("/all")
	public List<Room> getRoom()
	{
	return service.getAllRoom();
}
	
	@PutMapping
	public String updateRoom(@RequestBody Room room)
	{
		String msg="";
		try {
			service.updateRoom(room);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
	
	
	
	@DeleteMapping("{id}")
	public String deleteRoom(@PathVariable("id") int  id)
	{
		String msg="";	
		try {
			service.deleteRoom(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		
		return msg;
	}
}
