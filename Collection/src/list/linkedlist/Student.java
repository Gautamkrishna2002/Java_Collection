package list.linkedlist;

//import java.util.Iterator;
//Create a Java Program that does the following:
//	Accept a list of Student names from the User and store them in a LinkedList<String>.
//	Then, provide the following Menu-Driven Options to Manipulate the List:
//		a) Add a new Student at a Specific Position
//		b) Remove a Student name by Value
//		c) Display the first and last names
//		d) Reverse the entire list and display it
//		e) Search for a Student name and show its Position
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Students: ");
		int noOfStudents = sc.nextInt();
		
		for(int i = 0;i<noOfStudents;i++) {
		System.out.print("Enter Name: ");
		String name = sc.next();
//		sc.nextLine();
		li.add(name);
		}
		System.out.println(li);
		boolean temp2 = false;
		do {
		System.out.println("1.Add a new Student at a Specific Position");
		System.out.println("2.Remove a Student name by Value");
		System.out.println("3.Display the first and last names");
		System.out.println("4.Reverse the entire list and display it");
		System.out.println("5.Search for a Student name and show its Position");
		System.out.print("Enter Option: ");
		int option = sc.nextInt();
		if(option >0 && option<6) {
			switch(option) {
			case 1:
				System.out.print("Enter position: ");
				int add = sc.nextInt();
				if(add <= li.size()+1 && add>0) {
				System.out.print("Enter name: ");
				String addedName = sc.next();
				li.add(add-1, addedName);
				System.out.println(li);
				break;
				} else {
					System.out.println("Not Valid Position");
				}
			case 2:
				System.out.print("Name to be removed: ");
				String deleteName = sc.next();
				li.remove(deleteName);
				System.out.println(li);
				break;
			case 3:
				System.out.println(li.get(0)+ ", "+li.get(li.size()-1));
				break;
			case 4:
				System.out.println(li.reversed());
				break;
			case 5:
				System.out.print("Search Name: ");
				String searchName = sc.next();
//				System.out.println(li.contains(searchName));
				if(li.contains(searchName)==true) {
					for(int i =0; i<li.size();i++) {
						String temp = li.get(i);
						if(temp.equals(searchName)) {
							System.out.println(i+1);
						}
					}
				}
				else {
					System.out.println("Not Present");
				}
				break;
			}
			System.out.print("Do you want to continue (y/n): ");
			char op = sc.next().charAt(0);
			if(op == 'y') {
				temp2 = true;
			}
			else {
				temp2 = false;
				
			}
		}
		else {
			System.out.println("Invalid Option");
		}
		} while(temp2);
		System.out.println("Thank You!!!!!");
		
		sc.close();
		
	}

}
