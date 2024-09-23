package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionInterfaceArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Add
		//non generic list
	
			List lng = new ArrayList();
			lng.add("One");
			lng.add(1);
			lng.add("two");
			lng.add(2);
			lng.add("Three");
			lng.add(3);
			System.out.println("The list non generic is \n" + lng);
		//generic
			
			List<String> lg = new ArrayList<>();
			lg.add("hello");
			lg.add("1");
			lg.add("how");
			lg.add("hello");
			System.out.println("The list non generic is \n" + lg);
//2.Size
		//nongeneric
			
			System.out.println("The size of non generic list is " + lng.size());
			
		//generic
			System.out.println("The size of  generic list is " + lg.size());

//3.remove()
			//nongeneric
			lng.remove(0);
			System.out.println("After removing 0th index of non generic list is \n" + lng);
			
			
			//generic
			lg.remove(0);
			System.out.println("After removing 0th index of  generic list is \n" + lg);

//4.addAll()
			//nongeneric
			List lng2 = new ArrayList();
			lng2.add(4);
			lng2.add("Four");
			lng2.addAll(lng);
			System.out.println("The both non generic list added is \n" +lng2);
			
			//generic
			List<String> lg2 = new ArrayList<>();
			lg2.add("7");
			lg2.add("bye");
			lg2.addAll(lg);
			System.out.println("The both  generic list added is \n" +lg2);
			
//5.removeAll()
			//nongeneric
			lng2.removeAll(lng2);
			System.out.println("After removing all elements of second non generic list is \n"+ lng2);

			//generic
			lg2.removeAll(lg2);
			System.out.println("After removing all elements of second non generic list is \n"+ lg2);
//6.contains()
			//nongeneric
			boolean b = lng.contains("two");
			System.out.println("The contains method of non generic is " + b);
			
			//generic
			boolean bb = lg.contains("two");
			System.out.println("The contains method of non generic is " + bb);
			
//ITERATOR INTERFACE
			
			//non generic
			Iterator i = lng.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			//remove iterator
			i.remove();
			System.out.println("After removing \n" + lng);
			
			// generic
			Iterator ii = lg.iterator();
			while(ii.hasNext())
			{
				System.out.println(ii.next());
			}
			ii.remove();
			System.out.println("After removing \n" + lg);


}


	}

