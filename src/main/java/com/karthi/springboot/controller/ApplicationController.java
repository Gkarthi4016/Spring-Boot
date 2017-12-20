package com.karthi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthi.springboot.model.UserEntity;
import com.karthi.springboot.service.ApplicationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class ApplicationController {

	@Autowired
	ApplicationService applicationServiceImpl;
	@GetMapping("/user/")
	public ResponseEntity<List<UserEntity>> getAllUserDetails() {
		log.info("ApplicationController - getAllUserDetails starts here");
		List<UserEntity> userEntities = applicationServiceImpl.fetchUserDetails();
		return new ResponseEntity<List<UserEntity>>(userEntities,  HttpStatus.OK);
	}
}
