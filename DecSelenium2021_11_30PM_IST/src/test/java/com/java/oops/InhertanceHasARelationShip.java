package com.java.oops;

 class Address {
	String city, state, country;
	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class InhertanceHasARelationShip {
	int id;
	String name;
	Address obj;
	public InhertanceHasARelationShip(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.obj = address;
	}
	void display() {
		System.out.println(id + " " + name);
		System.out.println(obj.city + " " + obj.state + " " + obj.country);
	}
	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india");
		Address address2 = new Address("bno", "IP", "US");

		InhertanceHasARelationShip kiran = new InhertanceHasARelationShip(111, "varun", address1);
		InhertanceHasARelationShip e2 = new InhertanceHasARelationShip(112, "arun", address2);

		kiran.display();
		e2.display();
	}
}