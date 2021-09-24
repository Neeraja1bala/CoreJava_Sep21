package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 17;
		
		ThrowExample obj = new ThrowExample();
		
		try {
			
			obj.agecheck(age);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Exception");
		}
		
		 
		System.out.println("After Exceprion");

	}
	
	public void agecheck(int age) {
		
		if(age<18) {
			 
			 throw new ArithmeticException("Age not allowed");
			 
		 }
		 else {
			 System.out.println("Eligible");
		 }
		
	}

}
