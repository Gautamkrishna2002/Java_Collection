package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Names {

	public static void main(String[] args) {
		// Write a Java Program to remove names which are less than or equal to 5 from the ArrayList
		List al = new ArrayList();
		al.add("Raj");
		al.add("Ankit");
		al.add("Prathemesh");
		al.add("Shivam");
		al.add("Gautam");
		al.add("Sumit");
		al.add("Suraj");
		al.add("Luvkush");
		al.add("Pradeep");
		al.add("Prince");
		
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
//			Object obj = itr.next();
			String str = (String) itr.next();
			if(str.length()<6) {
				itr.remove();
			}
			
		}
		System.out.println(al);
		
		

	}

}
