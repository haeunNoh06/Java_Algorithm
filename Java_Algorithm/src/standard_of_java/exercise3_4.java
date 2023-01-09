package standard_of_java;

import java.util.Scanner;

public class exercise3_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("백의 자리 이상의 정수 입력 : ");
		int num = scan.nextInt();
		
		System.out.println("백의 자리 이하를 버린 수 : "+(num-(num%100)));
	}

}
