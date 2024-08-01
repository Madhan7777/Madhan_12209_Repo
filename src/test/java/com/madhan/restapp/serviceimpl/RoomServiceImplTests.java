package com.madhan.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.madhan.restapp.model.Room;

@SpringBootTest
class RoomServiceImplTests {

	@Autowired
	RoomServiceImpl rsi;
	
	@Test
	void testAddRoom() {
		Room obj = new Room(0,234,4000,6000,10000);
		assertEquals("success", rsi.addRoom(obj));
	}

	@Test
	void testGetRoom() {
		assertNotNull(rsi.getRoom(13));
	}

	@Test
	void testGetAllRoom() {
		assertNotNull(rsi.getAllRoom());
	}

	

//	@Test
//	void testDeleteRoom() {
//		assertEquals("deleted",rsi.deleteRoom(8));
//	}

}
