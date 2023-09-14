package JavaBasic;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. While Loop
		
		int i=1;
		while(i<=10) {
			
			System.out.println(i);
			i=i+1;
			
		}
		System.out.println("***************&********************");
		
		//2.For loop :
		
		for(int j=1;j<=10;j++) {
			
			System.out.println(j);
		}
		
		System.out.println("***************Revered********************");
		//print 10 to 1
		//10 9 8 7 6 5 4 3 2 1
		
		for(int k=10;k>=1;k--) {
			
			System.out.println(k);
		}
		
		System.out.println("***************AND********************");
		
		//Program to print half pyramid a using numbers
		
		int rows=5;
		
		for(int l=1;l<=rows;++l) {
			for(int n=1;n<=l;++n) {
				System.out.print(n + " ");
			}
			System.out.println();
			
		}

	}

}
