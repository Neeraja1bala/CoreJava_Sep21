package test;

public class RunnerClass {
	
	public static void main(String[] args) {
	
	Employee emp1 = new Employee();
	
	emp1.EmpId = 4556;
	emp1.Salary = 4700;
	
	
	emp1.display();
	//System.out.println(Employee.department);
	
	Employee emp2 = new Employee(1232,4500);
	emp2.display();
	
	Employee emp3 = new Employee("Raj", 40, "Hyd",12300,2500);
	emp3.display();
	
	PolymorphismExample  obj1 = new PolymorphismExample();
	obj1.add(12,18);
	obj1.add(5,5,7);
	obj1.add(12.3,34.6);
	
	Account objAccount = new Account();
	objAccount.setBalance(30000);
	System.out.println(objAccount.getBalance());
	
	}
}
