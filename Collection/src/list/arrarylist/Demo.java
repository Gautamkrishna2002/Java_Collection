package list.arrarylist;
import java.util.List;
import java.util.ArrayList;

public class Demo {
	//Collection

	public static void main(String[] args) {
		// TODO Auto-generated method 
		List al = new ArrayList();
		
		al.add(10);
		al.add(12.2);
		al.add('s');
		al.add("Hello World");
		al.add(true);
		al.add(null);
		al.add('s');
		
		System.out.println(al);
		System.out.println(al.size());
		al.remove("Hello World");
		System.out.println(al);
		System.out.println(al.size());
		al.add("Hello World");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(4));

	}

}
