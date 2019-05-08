package com.silverlila.silverlila.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="first_name")
	private String firstName;

	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;

	@Column(name="created_at")
	private String created_at;

	@Column(name="active")
	private int active;

	public Users(){

	}

	public Users(int id, String firstName, String username, String password, String created_at, int active) {
		this.id = id;
		this.firstName = firstName;
		this.username = username;
		this.password = password;
		this.created_at = created_at;
		this.active=active;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Users{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", created_at='" + created_at + '\'' +
				'}';
	}
}
