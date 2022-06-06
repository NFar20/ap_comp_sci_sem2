import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int c = 0; c<10; c++) {
			System.out.println("How big should the array be?");
			int size = sc.nextInt();
			
			for(int c1 = 0; c1<size; c1++) {
				arr1.add((int) (100*Math.random()+1));
			}
			
			toStringArrayList(arr1);
			System.out.println();
			getArrayListAverage(arr1);
			getArrayListMax(arr1);
			getArrayListMin(arr1);
		}
		
	}
	
	public static void toStringArrayList(ArrayList<Integer> arr) {
		for(int c = 0; c<arr.size(); c++) {
			System.out.print(arr.get(c) + " ");
		}
	}
	
	public static int getArrayListAverage(ArrayList<Integer> arr) {
		int sum = 0;
		for(int c = 0; c<arr.size(); c++) {
			sum+=arr.get(c);
		}
		return ((int) (sum/arr.size()));
	}
	
	public static int getArrayListMax(ArrayList<Integer> arr) {
		int max = -1;
		for(int c = 0; c<arr.size(); c++) {
			if(arr.get(c)>max) {
				max = arr.get(c);
			}
		}
		return max;
	}
	
	public static int getArrayListMin(ArrayList<Integer> arr) {
		int min = Integer.MAX_VALUE;
		for(int c = 0; c<arr.size(); c++) {
			if(arr.get(c)<min) {
				min = arr.get(c);
			}
		}
		return min;
	}
}
