package io.javabrains.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class Users {

	public Users(Users users) {
		// TODO Auto-generated constructor stub
		this.active=users.active;
		this.email=users.email;
		this.last_name=users.last_name;
		this.name=users.name;
		this.password=users.password;
		this.user_id=users.user_id;
		this.roles=users.roles;
	}
	public Users() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	@Column(name="active")
	private int active;
	@Column(name="email")
	private String email;
	@Column(name="last_name")
	private String last_name;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="user_role", joinColumns=
		@JoinColumn(name="user_id"), inverseJoinColumns=
		@JoinColumn(name="role_id"))
	private Set<Role> roles;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	

}
