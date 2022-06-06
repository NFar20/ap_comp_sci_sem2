import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
	
	public static int additionOfSums(int x, int y) {
		int sum;
		if(x == 1) {
			return x+y;
		}
		else {
			sum = x +additionOfSums(x-1, y);
			return sum;
			
		}
	}
	
	public static void palindrome(String str) {
		if(str.length()==1) {
			System.out.print(str);
			return;
		}
		else {
			System.out.print(str.substring(0,1));
			palindrome(str.substring(1));
			System.out.print(str.substring(0,1));
		}
	}
}
