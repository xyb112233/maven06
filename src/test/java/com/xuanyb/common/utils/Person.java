package com.xuanyb.common.utils;

import java.util.Date;

import org.junit.experimental.theories.DataPoint;

public class Person {
	private String name;
	private Integer age;
	private String about;
	@DataPoint("yyyy-MM-dd")
	private Date cteated;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCteated() {
		return cteated;
	}
	public void setCteated(Date cteated) {
		this.cteated = cteated;
	}
	public Person(String name, Integer age, String about, Date cteated) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.cteated = cteated;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", cteated=" + cteated + "]";
	}
	public Person() {
		super();
	}
	
	
}
