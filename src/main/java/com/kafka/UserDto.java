package com.kafka;

import lombok.Data;

@Data
public class UserDto {

	private String name;
	
	private String email;
	
	private String phoneNum;

	public UserDto(String name, String email, String phoneNum) {
		
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		
	}

	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", phoneNum=" + phoneNum + "]";
	}
}
