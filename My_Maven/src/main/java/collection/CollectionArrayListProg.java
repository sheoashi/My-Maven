package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.ADD method

		//non generic method
		
		ArrayList a = new ArrayList();
		a.add("First Element"); //string added
		a.add(2);  // integer added
		a.add(3.0f);  //float added
		a.add('f');  //char added
		System.out.println("The non generic Array List is ");
		System.out.println(a);
		
		//generic
		ArrayList<String> as = new ArrayList<String>();  // only string values gave
		as.add("first ele");
		as.add("second ele");
		as.add("third ele");
		as.add("fourth ele");
		System.out.println("The  generic Array List is ");
		System.out.println(as);

		//2.REMOVE method used to remove element in a index
		as.remove(1);
		System.out.println("The  removed Generic List is ");
		System.out.println(as);

		//3.ADDALL method
		//if we want to add all elements of an arraylist to another arraylist
		ArrayList<String> ass = new ArrayList<String>();
		ass.add("1st");
		ass.add("2nd");
		ass.addAll(as);
		System.out.println("The  added Generic List is ");
		System.out.println(ass);

		//4.RemoveAll - completely remove all elements in an list
		ass.removeAll(ass);
		System.out.println("The  remove all Generic List is ");
		System.out.println(ass);
		
		//get method - to get aa value of particular index
		System.out.println("The get method is " + as.get(1));

		//5.to find size - size() method
		System.out.println("The size is " + as.size());
		System.out.println(as);

		//6. contains() method used to check whether an element is present in that list and returns boolean value

		boolean b = as.contains("first ele");
		System.out.println(b);
		boolean bb = as.contains("how");
		System.out.println(bb);

		///ITERATOR INTERFACE
		System.out.println("the elemnts of a is " + a);
		System.out.println("The below is iterator interface");
		Iterator i = a.iterator();
		
		//java-->-->util(p)-->Iterator(interface)-->iterator


		//a=[firstelement,2,3.0,f]
		//a = 1,2,3,4


		while(i.hasNext()) // it checks whether there is element in 0th index
		{
		System.out.println(i.next()); //it will print the value in 0th index and moves to next index 1

		}
		i.remove(); //it removes last index of array
		System.out.println(a);

		}

	}


