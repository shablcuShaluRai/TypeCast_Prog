class Myclass2 {
	int x;

	 Myclass2(int x) {
	 this.x = x;
	 }
}

// this class contain methods to receive an object and display the class name
class knowname {
	public static void printname(Object obj) {

		// get class name into an object c of the class Class
		Class c = obj.getClass();
		// get the name of class using getName().
		String name = c.getName();
		System.out.println("The classname= " + name);

	}
}

public class Demo {

	public static void main(String[] args) {
		Myclass2 obj = new Myclass2(10);
		knowname.printname(obj);

	}

}
