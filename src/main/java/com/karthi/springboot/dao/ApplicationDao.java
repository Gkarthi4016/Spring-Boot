package com.karthi.springboot.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.karthi.springboot.model.UserEntity;

@Repository
public interface ApplicationDao extends JpaRepository<UserEntity, Long>{

	@Query("SELECT p FROM UserEntity p WHERE p.userName like %:userName% Order by p.userId")
	public List<UserEntity> findByName(@Param("userName") String userName);
	
	@Query(value="SELECT DEVICE.KARTHI_USER_SEQ.nextval from Dual", nativeQuery=true)
	public BigDecimal getSequenceId();
}
