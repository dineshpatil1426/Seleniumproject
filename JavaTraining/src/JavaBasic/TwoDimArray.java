package JavaBasic;

//import java.util.Iterator;
//import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		
		System.out.println(x.length); //total Number of rows  
		System.out.println(x[0].length);
		
		//1st Row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		//2nd Row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		//3rd row 
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		/*
		//print all the value of 2dim array : use for loop
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no.of Rows:");
		int rows=scan.nextInt();
		System.out.println("Enter no.of Columns:");
		int columns=scan.nextInt();
		
		int [][] multidimensionalArray = new int[rows][columns];
		
		// Now you can use the array like a regular
        // 2-dimensional array
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				multidimensionalArray[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(multidimensionalArray[i][j]+ " ");
			}
			System.out.println();
		}
		 */
	}

}
