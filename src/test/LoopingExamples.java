package test;

public class LoopingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for( i=1; i<=10; i++) {
			
		System.out.println(i);
		
		}
		
		System.out.println();
		int[] array1 = {11,34,55,33,78,54};
		
		String str1 = "Clean India";
		String str2 = "Clean India Green India";
		
		String revstr1 = "";
		
		for( i=0; i<array1.length; i++) {
			
			System.out.println(array1[i]);
			
			}
		
		System.out.println();
		
	//============================================	
		
		for( i=array1.length-1; i>=0; i--) {
			
			System.out.println(array1[i]);
			
			}
		
		System.out.println();
		
	//================================	=======
		
		//foreachloop
		for(int values:array1) {
			
			System.out.println(values);
			
		}
		
		System.out.println();
		
	//=========================================
		
		for(int j=0;j<str1.length();j++) {
			
			System.out.println(str1.charAt(j));
			
		}
		System.out.println();
		
	//======================================
		
		for(int j=str1.length()-1;j>=0;j--) {
			
			System.out.println(str1.charAt(j));
		}
		System.out.println();
		
	//=======================================	
		
		for(int j=str1.length()-1;j>=0;j--) {
			
			revstr1 = revstr1 + str1.charAt(j);
		}
		
		System.out.println("Reversed string is: " + revstr1);
		System.out.println();
	//=======================================================
		String[] words = str2.split(" ");  // {"Clean","India","Green","India"}
		System.out.println("Total words are: " + words.length);
		
		String str="Clean india Green India";
		String[] words1 = str.trim().split(" ");
		System.out.println("Total words are: " + words1.length);
		System.out.println();
		
	//================================================================================
		//while
		
		int x = 1;
		while(x<=10) {
			
			System.out.println(x);
			x=x+1;
		}
	System.out.println();
//=================================================
	
	   int n1 = 436721;
	   int rem,count=0;
	   
	   while(n1>0) {
		   rem = n1%10;
		   count++;
		   n1 = n1 / 10;
		   System.out.println(rem);
		   
		   
	   }
	   System.out.println("total digits :" + count);
	   System.out.println();
	   //===================================
	   
	   int n2=10;
	   
	   do {
		   System.out.println(n2);
		   n2--;
		   
	   }while(n2>0);
	   
		
		

	}

}
