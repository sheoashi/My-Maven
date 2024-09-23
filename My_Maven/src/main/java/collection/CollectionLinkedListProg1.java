package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedListProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ADD method
				//Generic
				LinkedList<String> lg = new LinkedList();
				lg.add("First");
				lg.add("Second");
				lg.add("Third");
				lg.add("Fourth");
				lg.add("Fifth");
				System.out.println("The generic arraylist\n" + lg);
				//Non Generic
				LinkedList lng = new LinkedList();
				lng.add(1);
				lng.add("one");
				lng.add(2);
				lng.add("Two");
				lng.add(3);
				lng.add("Three");
				System.out.println("The non generic arraylist\n" + lng);
				
				//2.REMOVE method used to remove element in a index
				//Generic
				System.out.println("The element removed in generic is " +lg.remove(3));
				System.out.println("The generic arraylist after removing element is \n" + lg);
				//NonGeneric
				System.out.println("The element removed non generic is " +lng.remove(3));
				System.out.println("The nongeneric arraylist after removing element is \n" + lng);
				
				//3.ADDALL method
				//Generic
				ArrayList<String> ngal = new ArrayList();
				ngal.add("Sixth");
				ngal.add("Seventh");
				ngal.add("eighth");
				ngal.addAll(lg);
				System.out.println("The combined generic arraylist is " + ngal );
				
				//Non Generic
				ArrayList nngal = new ArrayList();
				nngal.add(4);
				nngal.add("Four");
				nngal.add(5);
				nngal.addAll(lng);
				System.out.println("The combined generic arraylist is " + nngal );
				
				//4.RemoveAll - completely remove all elements in an list
				//Generic
				ngal.removeAll(ngal);
				System.out.println("The non generic list remove all method is " + ngal);

				//NonGeneric
				nngal.removeAll(nngal);
				System.out.println("The non generic list remove all method is " + nngal);
				
				//5.to find size - size() method
				//Generic
				System.out.println("The size of generic array is  " + lg.size());
				//NonGeneric
				System.out.println("The size of non generic array is  " + lng.size());
				
				//6. contains() method used to check whether an element is present in that list and returns boolean value
				//generic
				boolean b = lg.contains("Fifth");
				System.out.println(b);
				
				//non generic
				boolean bb = lng.contains("Fifth");
				System.out.println(bb);
				
				///ITERATOR INTERFACE
				//Generic
				Iterator i = lg.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				//remove method in iterator
				i.remove();
				System.out.println("The remove method in iterator is " + lg);
				
				//Non Generic
				Iterator ii = lng.iterator();
				while(ii.hasNext())
				{
					System.out.println(ii.next());
				}
				ii.remove();
				System.out.println("The remove method in non generic list iterator is " +lng);


				

			}
	}

