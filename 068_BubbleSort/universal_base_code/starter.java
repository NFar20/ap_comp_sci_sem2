import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		listBubbleSort(arr1);			//Create this method
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for(int outer = 0; outer<arr.length-1; outer++) {
			for(int inner = 0; inner<arr.length-outer-1; inner++) {
				if(arr[inner]>arr[inner+1]) {
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
	}
	
	public static void listBubbleSort(ArrayList<Integer> arr) {
		for(int outer = 0; outer<arr.size()-1; outer++) {
			for(int inner = 0; inner<arr.size()-outer-1; inner++) {
				if(arr.get(inner) > arr.get(inner+1)) {
					int temp = arr.get(inner);
					arr.set(inner, arr.get(inner+1));
					arr.set(inner+1, temp);
				}
			}
		}
	}
}
