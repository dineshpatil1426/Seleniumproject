package JavaBasic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello!");
		ar.add(12.33);
		ar.add('D');
		ar.add(600);
		
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		// to Print All Value of ArrayList : For Loop
		
		for (int i=0; i< ar.size(); i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(130);
		//ar1.add("dine");
		System.out.println(ar1.get(0));
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Dinesh Patil");
		//ar2.add(123);
		
		System.out.println(ar2.get(0));
		
		
		

	}
	

}
