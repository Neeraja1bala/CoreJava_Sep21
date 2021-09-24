package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample obj = new ThrowsExample();
		 try {
			obj.calculator();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public void calculator() throws InterruptedException {
		
		div();
		
	}
	
	public void div() throws InterruptedException {
		
		System.out.println("Inside div method");
		
		Thread.sleep(3000);
		
	}

}
