import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr = new int[200];
		
		for(int c = 0; c<arr.length; c++) {
			arr[c] = (int) (100*Math.random()+1);
		}
		
		for(int c = 0; c<arr.length; c++) {
			System.out.print(arr[c] + ", ");
		}
		System.out.println();
		
		insertionSort(arr);
		
		for(int c = 0; c<arr.length; c++) {
			System.out.print(arr[c] + ", ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] arr) {
		int outer, inner, key;
		
		for(outer = 0; outer<arr.length; outer++) {
			key = arr[outer];
			inner = outer-1;
			
			while(inner>=0 && arr[inner]>key) {
				arr[inner+1] = arr[inner];
				inner--;
			}
			
			arr[inner+1] = key;
		}
	}
}
