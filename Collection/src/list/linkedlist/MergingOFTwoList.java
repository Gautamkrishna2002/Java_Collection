package list.linkedlist;

//Create two LinkedList<Integer> and Merge them into s third list, removing any duplicates.
//INPUT: l1 = [10, 30, 20, 40, 50, 10]
//	   l2 = [20, 50, 60, 80, 20, 10]
//			 
//OPUTPUT: l3 = [10, 30, 20, 40, 50, 60, 80]

import java.util.LinkedList;
import java.util.List;

public class MergingOFTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li1 = new LinkedList<Integer>();
		List<Integer> li2 = new LinkedList<Integer>();
		li1.add(10);
		li1.add(30);
		li1.add(20);
		li1.add(40);
		li1.add(50);
		li1.add(10);
		System.out.println(li1);
		
		li2.add(20);
		li2.add(50);
		li2.add(60);
		li2.add(80);
		li2.add(20);
		li2.add(10);
		System.out.println(li2);
		List<Integer> li3 = new LinkedList<Integer>();
		for(Integer num : li1) {
			if(!li3.contains(num)) {
				li3.add(num);
			}
		}
		for(Integer num2 : li2) {
			if(!li3.contains(num2)) {
				li3.add(num2);
			}
		}
		System.out.println(li3);
		
		
	}

}
