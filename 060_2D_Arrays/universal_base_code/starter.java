import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows in the array?");
		int x = sc.nextInt();
		System.out.println("How many columns?");
		int y = sc.nextInt();
		
		int[][] jeffery = new int[x][y];
		
		for(int c = 0; c<jeffery.length; c++) {
			for(int c1 = 0; c1<jeffery[0].length; c1++) {
				jeffery[c][c1] = (int) (10*Math.random());
			}
		}
		System.out.println();
		arrayPrint(jeffery);


		
	}
	
	public static int rowAverage(int[][] arr, int row) {
		int sum = 0;
		for(int c = 0; c<arr[row].length; c++) {
			sum = sum + arr[row][c];
		}
		
		return sum/(arr[row].length);
	}
	
	public static int arrayAverage(int[][] arr) {
		int avg = 0;
		for(int c = 0; c<arr.length; c++) {
			for(int c1 = 0; c<arr[0].length; c++) {
				avg = avg + arr[c][c1];
			}
		}
		
		return avg/(arr.length*arr[0].length);
	}
	
	public static void arrayPrint(int [][] arr) {
		for(int c = 0; c<arr.length; c++) {
			for(int c1 = 0; c1<arr[0].length; c1++) {
				System.out.print(arr[c][c1]+ " ");
			}
			System.out.println();
		}
	}
}
