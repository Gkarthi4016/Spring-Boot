package com.karthi.springboot.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressVo {

	private String addressOne;
	private String addressTwo;
	private String city;
	private String state;
	private String country;
	private String zipCode;
}
