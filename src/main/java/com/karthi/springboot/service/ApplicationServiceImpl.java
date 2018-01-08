package com.karthi.springboot.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.karthi.springboot.dao.ApplicationDao;
import com.karthi.springboot.model.AddressEntity;
import com.karthi.springboot.model.OrderEntity;
import com.karthi.springboot.model.UserEntity;
import com.karthi.springboot.vo.UserVo;

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
	public UserEntity addNewUser(UserVo userVo) throws DataAccessException {
		Long userId  = applicationDao.getSequenceId().longValue();
		UserEntity userEntity = new UserEntity(userVo);
		userEntity.setUserId(userId);
		if(Objects.nonNull(userVo.getAddressEntity())) {
			AddressEntity addressEntity = new AddressEntity(userVo.getAddressEntity());
			addressEntity.setUserId(userId);
			/*addressEntity.setUserEntity(userEntity);*/
			userEntity.setAddressEntity(addressEntity);
		}
		if(CollectionUtils.isNotEmpty(userVo.getOrderList())) {
			List<OrderEntity> orderList = userVo.getOrderList().stream().map(o -> new OrderEntity(o, userId)).collect(Collectors.toList());
			userEntity.setOrderList(orderList);
		}
		
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
