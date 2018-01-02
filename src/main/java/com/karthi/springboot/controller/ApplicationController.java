package com.karthi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		List<UserEntity> userEntities = applicationServiceImpl.fetchUserDetails();
		return ResponseEntity.ok(userEntities);
	}
	
	@GetMapping("/user/id/{id}")
	public ResponseEntity<UserEntity> getUserDetails(@PathVariable("id") Long id) {
		UserEntity userEntities = applicationServiceImpl.findUserById(id);
		return ResponseEntity.ok(userEntities);
	}
	
	@GetMapping("/user/name/{userName}")
	public ResponseEntity<List<UserEntity>> getUserDetailsByName(@PathVariable("userName") String userName) {
		List<UserEntity> userEntities = applicationServiceImpl.findUserByName(userName);
		return ResponseEntity.ok(userEntities);
	}
	
	@PostMapping("/user/add")
	public ResponseEntity<UserEntity> addNewUser(@RequestBody UserEntity userEntity){
		UserEntity entity = applicationServiceImpl.addNewUser(userEntity);		
		return ResponseEntity.ok(entity);		
	}
	
	@PutMapping("/user/update")
	public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity userEntity){
		return ResponseEntity.ok(applicationServiceImpl.updateUser(userEntity));
	}
	
	@DeleteMapping("/user/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
		applicationServiceImpl.deleteUser(id);
		return ResponseEntity.ok("Success");
	}
	
}
