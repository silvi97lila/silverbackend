package com.silverlila.silverlila.model;

import javax.persistence.*;

@Entity
@Table(name="settings")
public class Silver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="title")
	private String title;

	@Column(name="sub_title")
	private String sub_title;

	@Column(name="social_insta")
	private String social_insta;

	@Column(name="social_facebook")
	private String social_facebook;

	@Column(name="social_linkedin")
	private String social_linkedin;

	@Column(name="social_github")
	private String social_github;

	public Silver(){

	}

	public Silver(int id, String title, String sub_title, String social_insta, String social_facebook, String social_linkedin, String social_github) {
		this.id = id;
		this.title = title;
		this.sub_title = sub_title;
		this.social_insta = social_insta;
		this.social_facebook = social_facebook;
		this.social_linkedin = social_linkedin;
		this.social_github = social_github;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSub_title() {
		return sub_title;
	}

	public void setSub_title(String sub_title) {
		this.sub_title = sub_title;
	}

	public String getSocial_insta() {
		return social_insta;
	}

	public void setSocial_insta(String social_insta) {
		this.social_insta = social_insta;
	}

	public String getSocial_facebook() {
		return social_facebook;
	}

	public void setSocial_facebook(String social_facebook) {
		this.social_facebook = social_facebook;
	}

	public String getSocial_linkedin() {
		return social_linkedin;
	}

	public void setSocial_linkedin(String social_linkedin) {
		this.social_linkedin = social_linkedin;
	}

	public String getSocial_github() {
		return social_github;
	}

	public void setSocial_github(String social_github) {
		this.social_github = social_github;
	}

	@Override
	public String toString() {
		return "Silver{" +
				"id=" + id +
				", title='" + title + '\'' +
				", sub_title='" + sub_title + '\'' +
				", social_insta='" + social_insta + '\'' +
				", social_facebook='" + social_facebook + '\'' +
				", social_linkedin='" + social_linkedin + '\'' +
				", social_github='" + social_github + '\'' +
				'}';
	}
}
