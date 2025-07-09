package iterable.listIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Problem {

	public static void main(String[] args) {
		//Write a Java Program that performs the following using an ArrayList of Integers:
		// -Add the following to the List: 10, 5, 20, 15, 25
		// -Insert the number 12 at Index 2;
		// -Print all elements on the list
		// -Check if the number 15 exists in the list and print an appropriate message
		// -Sort the list in ascending order 
		// -Remove the number 5 from the list
		// -Print the final list and its size
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(25);
		System.out.println(al);
		al.add(2, 12);
		System.out.println(al);
		boolean temp = false;
		for(Integer a:al) {
			if(a == 15) {
				temp = true;
				if(temp) {
					System.out.println("Yes 15 is present");
				} 
			}
			
		}
		if(temp == false) {
			System.out.println("No 15 is not present");
		}
		
		Collections.sort(al);
		System.out.println(al);
		al.remove((Object)5);
		System.out.println(al);
		System.out.println(al.size());

	}

}
