package school;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("영문자 입력 : ");
		String str = scan.nextLine();
		
		char[] ch = new char[str.length()];
				
		for ( int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}

		// 출력
		System.out.print("변환된 문자 : ");
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

}
