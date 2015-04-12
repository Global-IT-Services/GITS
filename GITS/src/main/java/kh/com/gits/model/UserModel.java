package kh.com.gits.model;

import java.sql.Date;

public class UserModel {

	private Integer id;
	private String name;
	private String email;
	private String password;
	private Date registeredDate;
	private String status;
	
	public UserModel() {
		
	}
	
	public UserModel(Integer id, String name, String email, String password,
			Date registeredDate, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.registeredDate = registeredDate;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
