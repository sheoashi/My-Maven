package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionInterfaceLinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Add() method
		
		//generic 
			List<Integer> lg = new LinkedList<>();
			lg.add(1);
			lg.add(2);
			lg.add(3);
			lg.add(4);
			lg.add(5);
			System.out.println("The generic list of linked list is \n" + lg);
	
		//non generic 
			List lng = new LinkedList();
			lng.add(1);
			lng.add(2);
			lng.add(3);
			lng.add(4);
			lng.add(5);
			System.out.println("The non generic list of linked list is \n" + lng);
			
	//2.size() method
	
			//generic
			System.out.println("The size of generic list of linked list is " + lg.size());

	
			//non generic
			System.out.println("The size of non generic list of linked list is " + lng.size());

	//3. remove() method
			//generic
			lg.remove(4);				
			System.out.println("The generic list after removing 4th index is " + lg  );
			//non generic
			lng.remove(4);				
			System.out.println("The list after removing 4th index is " + lng  );
	
	//4.addAll() method
			//generic
			List<Integer> lg2 = new LinkedList<>();
			lg2.add(6);
			lg2.add(7);
			lg2.add(8);
			lg2.add(9);
			lg2.add(10);
			lg2.addAll(lg);
			System.out.println("The both added list of generic is " + lg2);
			
			//non generic
			List<Integer> lng2 = new LinkedList<>();
			lng2.add(6);
			lng2.add(7);
			lng2.add(8);
			lng2.add(9);
			lng2.add(10);
			lng2.addAll(lng);
			System.out.println("The both added list of  nongeneric is " + lng2);
	//5.removeAll() method
			//generic
			lg2.removeAll(lg2);
			System.out.println("The remove all method of generic list is " + lg2);
			
			//non generic
			lng2.removeAll(lng2);
			System.out.println("The remove all method of nongeneric list is " + lng2);
			
	//6.contains() method
			//generic
			System.out.println("The generic method contains 2 is " + lg.contains(2));
			
			//non generic
			System.out.println("The generic method contains 6 is " + lng.contains(6));
			
	//ITERATOR for generic method
			Iterator i = lg.iterator();
			System.out.println("The Iterator using generic list is");
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
	//ITERATOR for non generic method
			
			Iterator ii = lng.iterator();
			System.out.println("The Iterator using non generic list is");

			while(ii.hasNext())
			{
				System.out.println(ii.next());
			}
	}

}
