package com.madhan.restapp.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Room;
import com.madhan.restapp.repository.RoomRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RoomRepoImpl implements RoomRepo{

	@Autowired
	EntityManager entitymanager;

	@Override
	public String save(Room room) {
		if(room!=null)
		{
			entitymanager.persist(room);

			return "success";
		}
		else
			return "failure";
	}
	
	

	@Override
	public List<Room> findAll() {
		String hql="from Room";
		Query query=entitymanager.createQuery(hql);
		return query.getResultList();	
		}

	@Override
	public String deleteById(int id) {
		if(id!=0)
		{
			Room room=entitymanager.find(Room.class,id);
			entitymanager.remove(room);
			return "deleted";
		}
		else
			return "not deleted";
		
	}
	
	

	@Override
	public Room findById(int id) {
		return entitymanager.find(Room.class, id);
	}

}
