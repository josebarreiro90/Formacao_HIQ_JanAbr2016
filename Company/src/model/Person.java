package model;

import java.util.Calendar;
import java.util.Date;

public abstract class Person {
	private String name;
	private final Date birthday;
	private int age;
	private String address;
	

	public Person(Date birthday) {
//		super();
		this.birthday=birthday;
	}
	
	public Person(Date birthday, String name, String address) {
		this(birthday);
		setName(name);
		setAddress(address);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		Calendar cal = Calendar.getInstance();
		
		
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
}
