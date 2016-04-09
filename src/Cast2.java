
class One1 {
	void show() {
		System.out.println("super class  method");
	}
}

class Two2 extends One1 {
	void show() {
		System.out.println("sub class method");
	}
}

public class Cast2 {

	
	public static void main(String[] args) {
		
		One1 t= new Two2();
		t.show();
		

	}

}
