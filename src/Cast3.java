class Onee {
	void show1() {
		System.out.println("super class  method");
	}
}

class Twoo extends Onee {
	void show2() {
		System.out.println("sub class method");
	}
}

public class Cast3 {

	public static void main(String[] args) {

		/*
		 * converting a super class type into subclass type is called
		 * specialization.
		 * 
		 * 
		 * specialization used the narrowing.
		 * 
		 * converting higher data type into lower data type is called narrowing.
		 */
		Onee o = new Twoo();
		Twoo t = (Twoo) o;
		t.show1();
		t.show2();
	}

}
