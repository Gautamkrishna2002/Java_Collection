package iterable.listIterator;

public class Employee {
	
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public static Employee createNewEmp(int id, String name, int salary) {
		return new Employee(id, name, salary);
	}
	
	public static String toDisplay(Employee e) {
		return "Employee [id="+e.id+", name="+e.name+", sal="+e.salary+"]";
	}

	
	

}
