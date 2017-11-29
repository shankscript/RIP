package com.shanks.rest.model;

// import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonIgnoreProperties(ignoreUnknown = true) 
public class User {
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private int phone;

//	public User(@JsonProperty("username") String username, @JsonProperty("password") String password,
//			@JsonProperty("firstname") String firstname, @JsonProperty("lastname") String lastname,
//			@JsonProperty("email") String email, @JsonProperty("address") String address,
//			@JsonProperty("phone") int phone) {
//		this.username = username;
//		this.password = password;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.email = email;
//		this.address = address;
//		this.phone = phone;
//
//	}
//	
//	public User() {
//		
//	}

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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
}