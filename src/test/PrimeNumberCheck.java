package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=24;
		int count=0;
		for(int i=1;i<=num/2;i++) {
		
		if(num%i==0) {
			
			count++;
			
			}
		
		
		}
		if(count==1) {
			System.out.println("Number is prime number");
		}
		else {
			System.out.println("Number is not a prime number");
		}
		

	}

}
