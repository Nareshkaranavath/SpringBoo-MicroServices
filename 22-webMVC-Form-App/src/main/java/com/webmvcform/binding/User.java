package com.webmvcform.binding;

public class User {

	private String name;
	private String email;
	private Long pho;
	
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
	public Long getPho() {
		return pho;
	}
	public void setPho(Long pho) {
		this.pho = pho;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", pho=" + pho + "]";
	}

}
