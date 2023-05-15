package javaFeatures;

public class Encapsulation3 {

	private String name;
	private double balance;

	private int IfscCode;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {

		return balance;

	}

	public int getIfscCode() {
		return IfscCode;
	}

	public void setIfscCode(int ifscCode) {
		IfscCode = ifscCode;
	}

	public static void main(String[] args) {

		Encapsulation3 e3 = new Encapsulation3();

		e3.setName("md Dastageer Ahemad ");
		System.out.println(e3.getName());

		e3.setIfscCode(7766);
		System.out.println(e3.getIfscCode());

		e3.setBalance(6665666.99);
		System.out.println(e3.getBalance());

	}

}
