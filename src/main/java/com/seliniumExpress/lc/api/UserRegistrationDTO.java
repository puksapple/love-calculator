package com.seliniumExpress.lc.api;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.seliniumExpress.lc.Annotation.Age;

public class UserRegistrationDTO {
@NotBlank(message = "username should not be blank")
@Pattern(regexp="[A-Za-z]+$" ,message="length must be 3")  
private String name;
private String userName;
private char[] password;
private String countryName;
private String[] hobbies;
private String gender;
@Age(lower = 20,upper=75)
private Integer age;

Date date;


public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

CommunicationChannnelDto com;
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String[] getHobbies() {
	return hobbies;
}
public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
}
public String getName() {
	return name;
}
public CommunicationChannnelDto getCom() {
	return com;
}
public void setCom(CommunicationChannnelDto com) {
	this.com = com;
}
public void setName(String name) {
	this.name = name;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public char[] getPassword() {
	return password;
}
public void setPassword(char[] password) {
	this.password = password;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}


}
