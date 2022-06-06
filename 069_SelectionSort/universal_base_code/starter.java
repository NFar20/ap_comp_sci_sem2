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
		
		selectionSort(arr);
		
		for(int c = 0; c<arr.length; c++) {
			System.out.print(arr[c] + ", ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] arr) {
		int inner, outer, min_index;
		
		for(outer = 0; outer<arr.length; outer++) {
			min_index = outer;
			for(inner = outer+1; inner<arr.length; inner++) {
				if(arr[inner]<arr[min_index]) {
					min_index = inner;
				}
			}
			int temp = arr[outer];
			arr[outer] = arr[min_index];
			arr[min_index] = temp;
		}
	}
}
