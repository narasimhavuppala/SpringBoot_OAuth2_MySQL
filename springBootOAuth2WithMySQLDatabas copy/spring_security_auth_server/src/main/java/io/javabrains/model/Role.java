package io.javabrains.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.persistant.entity

@Entity
@Table(name="role")
public class Role {

	@Id
	@GeneratedValue
	@Column(name="role_id")
	private int role_id;
	@Column(name="role")
	private String role;

	public Role() {
		
	}
	
	
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
