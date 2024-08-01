package com.madhan.restapp.repoimpl;

import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.User;
import com.madhan.restapp.repository.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepoImpl implements UserRepo{
	
	EntityManager entityManager;
	 
	public UserRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
 
	@Override
 
	public User findByUserName(String userName) {
		String jpql = "SELECT u FROM User u WHERE u.userName = :userName";
		TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		query.setParameter("userName", userName);
 
		try {
			return query.getSingleResult();
		} catch (NoResultException | NonUniqueResultException e) {
			return null;
		}
	}
		
		@Override
		public User save(User user) {
			entityManager.merge(user);
			return null;
		
	}

}
