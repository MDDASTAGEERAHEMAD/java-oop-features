package javaFeatures;

public class Inheritance {

	String name = "DASTAGEER";
	int age = 21;

	void voter() {
		int voterId = 24525;
		System.out.println(voterId);
	}
}

class Child extends Inheritance {
	String surname = "Gulbarga wale";
	int WardNum = 9;

	void city() {
		System.out.println("lives in basavakalyan");
	}

	public static void main(String[] args) {
		Child c = new Child();

		System.out.println("Name is : " + c.name);

		System.out.println("Age is : " + c.age);

		System.out.println("SurName is : " + c.surname);

		System.out.println("Ward number is  : " + c.WardNum);

		c.city();
		c.voter();
	}
}