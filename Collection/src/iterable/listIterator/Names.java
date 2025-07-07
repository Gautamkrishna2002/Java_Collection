package iterable.listIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		ListIterator itr = al.listIterator();
		System.out.println(itr.hasPrevious());//false
		System.out.println(itr.next());//Raj
		System.out.println(itr.next());//Ankit
		System.out.println(itr.next());//Prathemesh
		System.out.println(itr.hasPrevious());//true
		System.out.println(itr.previous());//Prathemesh
		System.out.println(itr.previous());//Ankit
		System.out.println(itr.next());//Ankit

	}

}
