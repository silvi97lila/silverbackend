package com.silverlila.silverlila.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name="work")
public class Work {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="project_name")
	private String project_name;

	@Column(name="path")
	private String path;

	public Work(){

	}

	public Work(int id, String project_name, String path) {
		this.id = id;
		this.project_name = project_name;
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "Work{" +
				"id=" + id +
				", project_name='" + project_name + '\'' +
				", path='" + path + '\'' +
				'}';
	}
}
