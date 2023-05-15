package javaFeatures;

public class PolymorphismDemo {

	double size = 7.8;

	String color = "Red";

	public int multi(int x, int y) {
		return x / y;
	}

	public int add(int a, int b) {
		return a + b;
	}

}

class Poly extends PolymorphismDemo {

	int id = 676;

	public int multi(int x, int y) {
		return x * y;
	}

	public int add(int a, int b) {
		return a - b;

	}

	public void a() {
		System.out.println("Sdi");
	}

}
