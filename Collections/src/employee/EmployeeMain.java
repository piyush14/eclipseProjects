package employee;

import java.util.HashMap;

public class EmployeeMain {

	public static void main(String[] args) {
		HashMap<Employee, String>  emp = new HashMap<>();
		emp.put(new Employee(100, 5.5), "ABC");
		emp.put(new Employee(70, 7.5), "PQR");
		emp.put(new Employee(63, 3.5), "XYZ");
		
		
		System.out.println(emp.get(new Employee(70, 7.5)));


	}

}

class Employee{
	public int weight;
	public double height;
	
	
	public Employee(int weight,double height){
		this.weight = weight;
		this.height = height;
	}
	
	@Override
	public int hashCode(){
		return 1;
		
	}
	
	@Override
	public boolean equals(Object obj){
		return true;
	}
}