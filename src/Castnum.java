
public class Castnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	byte bytevalue=20;
	short shortvlaue=255;
	int intvalue=25535;
	long longvalue=61535;
	float floatvalue=62235.3f;
	double doublevalue=62335.34;
	
	System.out.println(Byte.MAX_VALUE);
	
	intvalue=(int)longvalue;
	System.out.println(intvalue);
	
	doublevalue=(double)floatvalue;
	System.out.println(doublevalue);
	
	floatvalue=(float)doublevalue;
	System.out.println(floatvalue);
	
	shortvlaue=(short)bytevalue;
	System.out.println(shortvlaue);
	
	
	}

}
