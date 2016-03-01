package model;

import java.util.Date;

public class Employee extends Person {

	protected final int id;

	public Employee(Date birthday, int id) {
		this(birthday, null, null, id);
	}

	public Employee(Date birthday, String name, String address, int id) {
		super(birthday, name, address);
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
