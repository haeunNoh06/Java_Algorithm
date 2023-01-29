package doit_algorithm;

import java.util.Scanner;

public class Sum_001 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*10)+1;
		System.out.println(random);
		
		String str = scan.next();
		
		String[] arr = str.split("");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
		
	}

}
