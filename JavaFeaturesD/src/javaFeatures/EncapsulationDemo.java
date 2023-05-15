package javaFeatures;

public class EncapsulationDemo {

	int Rno;
	String size;

	public void setRno(int Rno) {
		this.Rno = Rno;
	}

	public void SetSize(String size) {

		this.size = size;

	}

	public int getRno() {
		return Rno;
	}

	public String getSize() {
		return size;
	}

	public static void main(String[] args) {

		EncapsulationDemo d = new EncapsulationDemo();
		d.setRno(15);
		d.SetSize("big");

		System.out.println("Roll Number Is : " + d.getRno());
		System.out.println("Size is : " + d.getSize());

	}

}
