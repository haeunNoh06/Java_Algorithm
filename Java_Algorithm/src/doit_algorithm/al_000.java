package doit_algorithm;

import java.util.Scanner;

public class Sort_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*10)+1;
		int[] num = new int[random];
		
		System.out.println("random : "+random);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length-i; j++) {
				if (num[j-1] > num[j]) {
					int tmp = num[j-1];
					num[j-1] = num[j];
					num[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
