package school;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		int max = 0;
		for ( int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"번째 수 : ");
			num[i] = scan.nextInt();
			if ( max < num[i]) max = num[i];
		}
		System.out.println("가장 큰 수 : "+max);
	}

}
