package test;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {11,34,55,33,78,54};
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		System.out.println(array1[5]);
		
		System.out.println(array1.length);
		
		System.out.println(array1[array1.length-1]);
		
		array1[0]=5;
		System.out.println(array1[0]);
		
	}

}
