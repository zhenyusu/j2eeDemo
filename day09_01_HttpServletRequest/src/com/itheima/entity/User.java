package com.itheima.entity;

import java.util.Arrays;

//��ʵ�����е��ֶ�Ҫ����е�name��һ�¡�Լ�����ڱ���
public class User {
	private String userName;
	private String pwd;
	private String sex;
	private String [] hobby;
	private String city;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {  
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [city=" + city + ", hobby=" + Arrays.toString(hobby)
				+ ", pwd=" + pwd + ", sex=" + sex + ", userName=" + userName
				+ "]";
	}
	

}
