package com.madhan.restapp.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Room;
import com.madhan.restapp.model.Student;
import com.madhan.restapp.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepoImpl implements StudentRepo {

	@Autowired
	EntityManager entitymanager;

	@Override
	public String save(Student stud) {
		if(stud!=null)
		{
			entitymanager.merge(stud);

			return "success";
		}
		else
			return "failure";
	}
		
	

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return entitymanager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		String hql="from Student";
		Query query=entitymanager.createQuery(hql);
		return query.getResultList();	
		}

	@Override
	public String update(Student stud) {
		if(stud!=null) {
			entitymanager.merge(stud);
			return "success";
			}
			else
				return "failure";
		}
		
	

	@Override
	public String deleteById(int id) {
		if(id!=0)
		{
			Student stud=entitymanager.find(Student.class,id);
			entitymanager.remove(stud);
			return "deleted";
		}
		else
			return "not deleted";
		
	}
	
		
	
	
	
}
