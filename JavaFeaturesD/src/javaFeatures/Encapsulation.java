package javaFeatures;

public class Encapsulation {

	private String name;
	private int IfscCode;
	private double Accno;

	public int getIfscCode() {
		return IfscCode;
	}

	public void setIfscCode(int ifscCode) {
		IfscCode = ifscCode;
	}

	public double getAccno() {
		return Accno;
	}

	public void setAccno(double accno) {
		Accno = accno;
	}

	public void setName(String name) {
		name = this.name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();

		e.setName("yttg");

		e.setIfscCode(286305);

		e.setAccno(4711648637.6d);

		System.out.println("Name : " + e.getName());

		System.out.println("IFSC Code is : " + e.getIfscCode());

		System.out.println("Account naumber is : " + e.getAccno());

	}
}