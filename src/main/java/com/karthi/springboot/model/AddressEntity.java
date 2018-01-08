package com.karthi.springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.karthi.springboot.vo.AddressVo;

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
	/*@GenericGenerator(name = "DEVICE.KARTHI_USER_SEQ", strategy = "foreign", parameters = @Parameter(name = "property", value = "karthi_user"))
	@GeneratedValue(generator = "DEVICE.KARTHI_USER_SEQ")*/
	private Long userId;
	
	@Column(name="address_line1")
	private String addressOne;
	
	@Column(name="address_line2")
	private String addressTwo;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="zipcode")
	private String zipCode;

	@OneToOne(optional=false)
	@PrimaryKeyJoinColumn
	//@JsonBackReference
	@JsonIgnore
	private UserEntity userEntity;
	
	public AddressEntity(AddressVo addressVo) {
		if(Objects.nonNull(addressVo)) {
			this.addressOne = addressVo.getAddressOne();
			this.addressTwo = addressVo.getAddressTwo();
			this.city = addressVo.getCity();
			this.state = addressVo.getState();
			this.country = addressVo.getCountry();
			this.zipCode = addressVo.getZipCode();
		}
	}
}
