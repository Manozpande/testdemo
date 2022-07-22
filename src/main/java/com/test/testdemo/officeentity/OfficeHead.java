package com.test.testdemo.officeentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="officehead")
public class OfficeHead {
	@Id
	@Column(length=10)
private String id;
	@Column(length=30)
private String officeName;

}
