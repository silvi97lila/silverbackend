package com.silverlila.silverlila.model;
import javax.persistence.*;

@Entity
@Table(name="about")
public class About {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="tittle")
	private String tittle;

	@Column(name="sub_tittle")
	private String sub_tittle;

	@Column(name="body")
	private String body;

	@Column(name="mail")
	private String mail;

	@Column(name="phone")
	private int phone;

	@Column(name="skype")
	private String skype;

	@Column(name="web")
	private String web;

	public About(){

	}

	public About(String title, String sub_title, String body, String mail, int phone, String skype, String web) {
		this.tittle = title;
		this.sub_tittle = sub_title;
		this.body = body;
		this.mail = mail;
		this.phone = phone;
		this.skype = skype;
		this.web = web;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return tittle;
	}

	public void setTitle(String title) {
		this.tittle = title;
	}

	public String getSub_title() {
		return sub_tittle;
	}

	public void setSub_title(String sub_title) {
		this.sub_tittle = sub_title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	@Override
	public String toString() {
		return "About{" +
				"id=" + id +
				", title='" + tittle + '\'' +
				", sub_title='" + sub_tittle + '\'' +
				", body='" + body + '\'' +
				", mail='" + mail + '\'' +
				", phone=" + phone +
				", skype='" + skype + '\'' +
				", web='" + web + '\'' +
				'}';
	}
}
