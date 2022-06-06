import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public void 3mergeSort(int [] A, int [] B, int [] C){
		int a = 0;
		int b = 0;
		int c = 0;
		for(a<A.length) {
			if(A[a] > B[b]) {
				C[c] = A[a];
				a++
			}
			else {
				C[c] = B[b];
				b++
			}
			c++
		}
	}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public void mergeSort(int [] A, int first, int last){
		int mid = A.length/2;
		int[] one = new int[A.length/2-1];
		int[] two = new int[A.length-one.length];
		
	}
	
	public static void main(String args[]) {

		
	}
}
