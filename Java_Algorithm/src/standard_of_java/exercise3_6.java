package standard_of_java;

import java.util.Scanner;

public class exercise3_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		System.out.println("출력 : "+((((num/10)+1)*10)-num));
	}

}
