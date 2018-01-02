package com.karthi.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.karthi.springboot.dao.ApplicationDao;
import com.karthi.springboot.model.UserEntity;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	
	@Autowired
	public ApplicationDao  applicationDao;

	@Override
	public List<UserEntity> fetchUserDetails() throws DataAccessException {
		return applicationDao.findAll(new Sort(Sort.Direction.ASC, "userId"));
	}

	@Override
	public UserEntity findUserById(Long id) throws DataAccessException {
		return applicationDao.findOne(id);
	}
	
	@Override
	public List<UserEntity> findUserByName(String userName) throws DataAccessException {
		return applicationDao.findByName(userName);
	}

	@Override
	public UserEntity addNewUser(UserEntity userEntity) throws DataAccessException {
		
		 return applicationDao.save(userEntity);
	}
	
	@Override
	public UserEntity updateUser(UserEntity userEntity) throws DataAccessException {
		
		 return applicationDao.save(userEntity);
	}

	@Override
	public void deleteUser(Long id) throws DataAccessException {
		 applicationDao.delete(id);
	}


}
