package com.karthi.springboot.vo;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVo {

	private Long userId;
	private String userName;
	private AddressVo addressEntity;
	List<OrderVo> orderList;

}
