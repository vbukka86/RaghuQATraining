package com.java.oops;

class Person {
	int id;
	String name;
	
	Person() {
		System.out.println("inside default constructor or no argument constructor");
	}

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		//super();
		super(id, name);// reusing parent constructor
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

class superRealTimeExample {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "ankit", 45000f);
		e1.display();
	}
}