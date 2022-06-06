import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<String> arr2 = new ArrayList<String>();
		addValuesInt(arr1, 10);
		addValuesString(arr2, 10);
		printValuesInt(arr1);
		System.out.println();
		printValuesString(arr2);

		System.out.println();
		searchArrInt(arr1, 5);
		System.out.println();
		searchArrString(arr2, "apple");
		System.out.println();
		
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));
		}
	}

	public static void addValuesString(ArrayList<String> arr, int num){
		for(int i = 0; i < num; i++){
			int rand = (int)(Math.random()*4);
			if(rand == 0)
				arr.add(new String("potato"));
			else if(rand == 1)
				arr.add(new String("apple"));
			else if(rand == 2)
				arr.add(new String("banana"));
			else if(rand == 3)
				arr.add(new String("orange"));
		}
			
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void printValuesString(ArrayList<String> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void searchArrInt(ArrayList<Integer> arr, int a) {
		ArrayList<Integer> indices = new ArrayList<Integer>();
		for(int c = 0; c<arr.size(); c++) {
			if(arr.get(c) == a) {
				indices.add(c);
			}
		}
		
		if(indices.size()>0) {
			System.out.println("yes");
			System.out.print("These are the indices of your desired value: ");
		}
		else {
			System.out.println("no");
		}
		
		for(int c = 0; c<indices.size(); c++) {
			System.out.print(indices.get(c) + " ");
		}
	}
	
	public static void searchArrString(ArrayList<String> arr, String str) {
		ArrayList<Integer> indices = new ArrayList<Integer>();
		for(int c = 0; c<arr.size(); c++) {
			if(arr.get(c).equals(str)) {
				indices.add(c);
			}
		}
		
		if(indices.size()>0) {
			System.out.println("yes");
			System.out.print("These are the indices of your desired string: ");
		}
		else {
			System.out.println("no");
		}
		
		for(int c = 0; c<indices.size(); c++) {
			System.out.print(indices.get(c) + " ");
		}
	}
}
