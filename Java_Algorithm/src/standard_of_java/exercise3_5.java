package standard_of_java;

import java.util.Scanner;

public class exercise3_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		System.out.println("1의 자리를 1로 바꾼 값 : "+((num/10)*10+1));
	}

}
