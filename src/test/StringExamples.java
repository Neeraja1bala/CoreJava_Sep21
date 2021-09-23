package test;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Fname = "Raj";
		String Lname = "Mathur";
		String FullName =  Fname+ " "+Lname;
		System.out.println("Fullname is " + FullName);
		int length = FullName.length();
		System.out.println("Length of FullName is: " + length);
		System.out.println("Name in uppercase: " + FullName.toUpperCase());
		System.out.println("Name in lowercase: " + FullName.toLowerCase());
		
		String NewName = FullName.replace(" ", ",");
		System.out.println("NewName is: " + NewName);

	}

}
