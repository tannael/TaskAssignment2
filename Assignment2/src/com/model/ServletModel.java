package com.model;

public class ServletModel {
	protected int id;
	protected String name, email, username, password, phone,  photo, file, comment;
	
	
	public ServletModel() {
	}

	
	public ServletModel(int id, String username) {
		super();
		this.id = id;
		this.username = username;
	}


	public ServletModel( String name, String email, String username, String password, String phone,
			String photo, int id ) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.photo = photo;
	}


	public ServletModel(int id, String file, String comment) {
		super();
		this.id = id;
		this.file = file;
		this.comment = comment;
	}

	public ServletModel(int id) {
		super();
		this.id = id;
	}
	
	public ServletModel(int id, String name, String email, String username) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
	}
	public ServletModel(int id, String name, String email, String username, String password, String phone, String photo,
			String file, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.photo = photo;
		this.file = file;
		this.comment = comment;
	}
	public ServletModel(int id, String name, String email, String username, String photo, String file) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.photo = photo;
		this.file = file;
	}
	public ServletModel(int id, String name, String email, String username, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.comment = comment;
	}
	public ServletModel(int id, String name, String email, String username, String photo, String file, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.photo = photo;
		this.file = file;
		this.comment = comment;
	}
	public ServletModel(String file, String comment) {
		super();
		this.file = file;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}