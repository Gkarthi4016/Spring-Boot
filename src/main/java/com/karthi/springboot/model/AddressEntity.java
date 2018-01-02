package com.karthi.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="KARTHI_ADDRESS", schema="DEVICE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class AddressEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9048963717773210881L;
	
	@Id
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="address_line1")
	private String addressOne;
	
	@Column(name="address_line2")
	private String addressTwo;
	
	@Column(name="street")
	private String street;
	
	@Column(name="country")
	private String country;
	
	@Column(name="zipcode")
	private String zipCode;

}
