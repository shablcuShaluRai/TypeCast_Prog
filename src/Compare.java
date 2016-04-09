class Myclass {
	int x;

	Myclass(int x) {
		this.x = x;

	}
}

public class Compare {

	public static void main(String[] args) {

		/*
		 * compare two object by using the equals() method of object class.this
		 * method compare the references of object .if both the references are
		 * same object,then it gives true,otherwise it gives false.
		 */

		Myclass obj1 = new Myclass(15);
		// System.out.println(obj1);
		Myclass obj2 = new Myclass(15);
		// System.out.println(obj2);

		/*
		 * wrapper class[integer,float,String,char] objects of the objects,if
		 * the content are same then it returns true ,otherwise false.
		 */

		Integer obj3 = new Integer(15);
		Integer obj4 = new Integer(15);

		if (obj1.equals(obj2))

			System.out.println("obj1& obj2 are same");
		else
			System.out.println("obj1&obj2 are not same");

		if (obj3.equals(obj4))
			System.out.println("obj3 & obj4 are same");
		else
			System.out.println("obj3 &obj4 are not same");

	}

}
