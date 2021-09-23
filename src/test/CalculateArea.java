package test;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = 7;
		double area = (22*r*r)/7;
		System.out.println("Area of circle is " + area);
		 
		int length;
		int breadth;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Lenght: ");
		length = scan.nextInt();
		System.out.println("Enter Breadth: ");
		breadth = scan.nextInt();
		int area1= length * breadth;
		
		
		System.out.println("Area of rectangle is " + area1);
		
		
		
		

	}

}
