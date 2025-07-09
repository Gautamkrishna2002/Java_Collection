package iterable.listIterator;

import java.util.ArrayList;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> al = new ArrayList<Employee>();
		al.add(Employee.createNewEmp(1, "Gautam", 50000));
		al.add(Employee.createNewEmp(2, "Ankit", 50000));
		al.add(Employee.createNewEmp(3, "Rahul", 21321));
		System.out.println(al);
		
		for(Employee e: al) {
			System.out.println(Employee.toDisplay(e));
		}

		
	}

}
