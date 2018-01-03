package com.karthi.springboot.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="KARTHI_USER", schema="DEVICE")
@Data
@AllArgsConstructor
@Getter
@Setter
@Builder
@NoArgsConstructor
public class UserEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -252020216339644666L;
	
	@Id
	@Column(name="user_id")
	private Long userId;
	@Column(name="user_name")
	private String userName;
	
	@OneToOne(mappedBy="userEntity", cascade=CascadeType.ALL)
	private AddressEntity addressEntity;
	
	@OneToMany(mappedBy="userEntity", cascade=CascadeType.ALL)
	private List<OrderEntity> orderList;
}
