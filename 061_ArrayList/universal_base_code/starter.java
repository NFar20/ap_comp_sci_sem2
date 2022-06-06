import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cookie?");
		int n = sc.nextInt();
		ArrayList<String> cookieMonster = new ArrayList<String>();
		
		for(int c = 0; c<n; c++) {
			cookieMonster.add(c, "cookies");
		}
		
		for(int c = 0; c<cookieMonster.size(); c++) {
			System.out.print(cookieMonster.get(c)+ " ");
		}


		
	}
}
