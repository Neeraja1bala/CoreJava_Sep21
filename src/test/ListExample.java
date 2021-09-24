package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list = new ArrayList <String> ();
		
		list.add("Aman");
		list.add("Rohan");
		list.add("Nisha");
		list.add("Aman");
		
		
		System.out.println(list);
		System.out.println();
		System.out.println(list.get(2));
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		Iterator <String> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.println(itr.next());
		}
		
		for(String data:list) {
			System.out.println(data);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		//Collections.reverse(list);
		//System.out.println(list);
		System.out.println();
		
		
		LinkedList<String> list1 = new LinkedList<String> ();
		
		list1.add("Subham");
		list1.add("Ashvin");
		list1.add("Viraj");
		list1.add("Subham");
		
		list1.addFirst("Raj");;
		list1.addLast("Ganesh");
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();
		Iterator <String> itr1 = list1.listIterator();
		while(itr1.hasNext()) {
			
			
			System.out.println(itr1.next());
		}
		
		Stack<String> stack = new Stack <String> ();
		stack.push("name1");
		stack.push("name2");
		stack.push("name3");
		stack.pop();
		stack.push("name4");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		
		
		Vector<String> vector = new Vector <String> ();
		
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.remove(1);
		vector.add("Four");
		System.out.println(vector);
	}

}
