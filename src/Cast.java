/*
 * change one data type to another data type is called cast.
 * 
 */

class One {
	void show1() {
		System.out.println("super class  method");
	}
}

class Two extends One {
	void show2() {
		System.out.println("sub class method");
	}
}

public class Cast {

	public static void main(String[] args) {
		/*
		 * converting a sub class type into super class type is called
		 * generalization.
		 * 
		 * generalization needs widening.where widening refer to convert lower
		 * data type to higher data type
		 */
		One o = new Two();
		// Two t=new Two();
		// t.show1()
		o.show1();

	}

}
