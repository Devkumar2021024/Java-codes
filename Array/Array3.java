// Default value of array

import java.util.Arrays;

public class Array3 {
	int intArray[] = new int[3];
	float floatArray[] = new float[3];
	byte byteArray[] = new byte[3];
	boolean boolArray[] = new boolean[3];
	String stringArray[] = new String[3];

	public static void main(String args[]) {
		Array3 obj = new Array3();
		System.out.println("Int defalut value= " + Arrays.toString(obj.intArray));		
		System.out.println("Float defalut value= " +Arrays.toString(obj.floatArray));
		System.out.println("Byte default value" + Arrays.toString(obj.byteArray));
		System.out.println("Bollean default value" + Arrays.toString(obj.boolArray));
		System.out.println("String default value" + Arrays.toString(obj.stringArray));
	}
}