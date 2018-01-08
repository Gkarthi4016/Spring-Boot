package com.karthi.springboot.vo;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderVo {

	private Long orderId;
	private Long userId;
	private Long price;
	private Date orderDate;
}
