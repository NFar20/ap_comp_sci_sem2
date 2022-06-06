import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);	//Create this method.
		System.out.println();
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList<Integer> arr) {
		for(int c = 0; c<arr.size(); c++) {
			for(int c1 = c + 1; c1<arr.size(); c1++) {
				if(arr.get(c) == arr.get(c1)) {
					arr.remove(c1);
				}
			}
		}
	}
}
