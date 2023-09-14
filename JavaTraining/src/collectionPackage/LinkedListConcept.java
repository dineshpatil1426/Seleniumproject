package collectionPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll =new LinkedList<String>();
		
		//add: 
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//Print : 
		
		System.out.println("content of  linkedlist:"+ ll);
		
		//addFirst
		ll.addFirst("Dinesh");
		
		//addlast
		ll.addLast("Patil");
		
		System.out.println("content of  linkedlist:"+ ll);
		
		//get 
		
		System.out.println(ll.get(0));
		//set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		 
		
		//Remove first & Last Elements
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("content of  linkedlist:"+ ll); 
		
		ll.remove(2);
		
		System.out.println("content of  linkedlist:"+ ll); 
		
		
		//How to print  all the  Value in Linkedlist : 
		//for Loop 
		
		System.out.println("********using for loop");
		
		for(int n=0; n<ll.size();n++) {
			
			System.out.println(ll.get(n));
		}
		
		//Advance for loop
	
		System.out.println("********using  Advance for loop");
		
		for(String str: ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("**********using for interator ");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("**********using while loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
			
		}
		
		
		
	}

}
