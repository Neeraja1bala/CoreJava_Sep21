package test;

public class ConditionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
			System.out.println("Even:"+ i);
			}
			else {
				System.out.println("Odd :"+i);
			}
		}
		//============================================
		int age=17;
		if(age>=18) {
			System.out.println("Eligile for voting");
		}
		else if(age==17) {
			System.out.println("sorry, you will be eligible for next year");
		}
		else {
			System.out.println("sorry, your are not eligible");
		}

	}

}
