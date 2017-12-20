package com.karthi.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthi.springboot.model.UserEntity;

@Repository
public interface ApplicationDao extends JpaRepository<UserEntity, Long>{

}
