package school;

import java.util.Scanner;

public class Calculate {

	int n1, n2;
	
	public Calculate(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	// +
	public int plus() {
		return n1+n2;
	}
	// -
	public int minus() {
		return n1-n2;
	}
	// *
	public int multiply() {
		return n1*n2;
	}
	// /
	public double division() {
		return n1/n2;
	}
	
	public void printResult() {
		System.out.println("===두수의 사칙연산 결과===");
		System.out.println(n1+" + "+n2+" = "+plus());
		System.out.println(n1+" - "+n2+" = "+minus());
		System.out.println(n1+" * "+n2+" = "+multiply());
		System.out.println(n1+" / "+n2+" = "+division());
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("계산하고자 하는 첫번째 수 입력 : ");
		int n1 = scan.nextInt();
		System.out.print("계산하고자 하는 두번째 수 입력 : ");
		int n2 = scan.nextInt();
		
		Calculate c1 = new Calculate(n1,n2);
		c1.printResult();
	}

}
