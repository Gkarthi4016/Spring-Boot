package com.karthi.springboot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="KARTHI_ORDERS", schema="DEVICE")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1976777812516510226L;
	
	@Id
	@Column(name="Order_Id")
	private Long orderId;
	
	@Column(name="User_Id")
	private Long userId;
	
	@Column(name="price")
	private Long price;
	
	@Column(name="Order_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;

	@ManyToOne
	@JoinColumn(name="user_id", nullable=false, insertable=false, updatable=false)
	@JsonIgnore
	private UserEntity userEntity;
	
}
