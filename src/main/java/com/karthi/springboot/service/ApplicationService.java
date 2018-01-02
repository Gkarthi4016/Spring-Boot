package com.karthi.springboot.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.karthi.springboot.model.UserEntity;

public interface ApplicationService {
	
	public List<UserEntity> fetchUserDetails() throws DataAccessException;
	
	public UserEntity findUserById(Long id) throws DataAccessException;
	
	public List<UserEntity> findUserByName(String userName) throws DataAccessException;
	
	public UserEntity addNewUser(UserEntity userEntity) throws DataAccessException;

	public UserEntity updateUser(UserEntity userEntity) throws DataAccessException;
	
	public void deleteUser(Long id) throws DataAccessException;
}
