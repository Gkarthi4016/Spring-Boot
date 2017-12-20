package com.karthi.springboot.model;

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
@Table(name="KARTHI_USER", schema="DEVICE")
@Data
@AllArgsConstructor
@Getter
@Setter
@Builder
@NoArgsConstructor
public class UserEntity {

	@Id
	@Column(name="user_id")
	private Long userId;
	@Column(name="user_name")
	private String userName;
}
