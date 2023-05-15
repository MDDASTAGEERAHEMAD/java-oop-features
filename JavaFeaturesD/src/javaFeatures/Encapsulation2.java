package javaFeatures;

public class Encapsulation2 {

	private double balance;
	private String Name;
	private int id;
	private int Code;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public static void main(String[] args) {

		Encapsulation2 e2 = new Encapsulation2();

		e2.setName("dastageer");
		System.out.println("Name : " + e2.getName());

		System.out.println("---");

		e2.setBalance(342324.53433);
		System.out.println("Balance : " + e2.getBalance());

		e2.setId(15);
		System.out.println("Id is : " + e2.getId());

		e2.setCode(565);
		System.out.println("Code is : " + e2.getCode());
	}

}
