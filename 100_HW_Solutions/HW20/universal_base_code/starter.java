import java.util.*;

class starter {
	public static void main(String args[]) {
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		
		for(int c = 0; c<100; c++) {
			arr1.add(c, ((int) (101*Math.random())));
		}
		
		arr2 = arr1;
		arr3 = arr1;
		
		listBubbleSort(arr1);
		System.out.println(arr1.get(arr1.size()/2));
		
		for(int c = 0; c<arr1.size(); c++) {
			System.out.print(arr1.get(c)+" ");
		}
		System.out.println();
		
		listSelectionSort(arr2);
		System.out.println(arr2.get(arr2.size()/2));
		
		listInsertionSort(arr3);
		System.out.println(arr3.get(arr3.size()/2));
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
	
	public static void listSelectionSort(ArrayList<Integer> arr) {
		int outer;
		int inner;
		int mid_index;
		
		for(outer = 0; outer<arr.size(); outer++) {
			mid_index = outer;
			for(inner = outer+1; inner<arr.size(); inner++) {
				if(arr.get(inner)<arr.get(mid_index)) {
					mid_index = inner;
				}
			}
			int temp = arr.get(outer);
			arr.set(outer, arr.get(mid_index));
			arr.set(mid_index, temp);
		}
	}
	
	public static void listInsertionSort(ArrayList<Integer> arr) {
		int outer;
		int inner;
		int key;
		
		for(outer = 0; outer<arr.size(); outer++) {
			key = arr.get(outer);
			inner = outer-1;
			while(inner>=0 && arr.get(inner)>key) {
				arr.set(inner+1, arr.get(inner));
				inner--;
			}
			arr.set(inner + 1, key);
		}
	}
}
