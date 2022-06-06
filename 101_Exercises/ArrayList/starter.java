import java.util.*;

class starter {
	public static void printArrayList(ArrayList<Integer> arr) {
		for(int c = 0; c<arr.size(); c++) {
			System.out.print(" " + arr.get(c));
		}
	}
	
	public static void addValuesArrayList(int n, ArrayList<Integer> arr) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n+arr.size());
		for(int c = 0; c<arr.size(); c++) {
			arr1.set(c, arr.get(c));
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values would you like in your Array List?");
		int length = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		addValuesArrayList(length, array);
		printArrayList(array);



	}
}
