package school;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		double avg = 0.0;
		
		for ( int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"번째 수 : ");
			num[i] = scan.nextInt();
			avg += num[i];
		}
		System.out.printf("평균 : %.2f", (avg/num.length));
	}

}
