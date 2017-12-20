package com.karthi.springboot.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.karthi.springboot.model.UserEntity;

public interface ApplicationService {
	
	public List<UserEntity> fetchUserDetails() throws DataAccessException;

}
