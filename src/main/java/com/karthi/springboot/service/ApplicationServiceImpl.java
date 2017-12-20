package com.karthi.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.karthi.springboot.dao.ApplicationDao;
import com.karthi.springboot.model.UserEntity;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	
	@Autowired
	public ApplicationDao  applicationDao;

	@Override
	public List<UserEntity> fetchUserDetails() throws DataAccessException {
		return applicationDao.findAll();
	}

}
