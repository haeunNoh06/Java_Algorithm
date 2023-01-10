package school;

import java.util.Scanner;

public class SalesVol {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] sale = new int[3][4];
		int[] yearSum = new int[] {0,0,0};// 연간 판매량
		int allSum = 0;// 누적 판매량
		
		for ( int i = 0; i < sale.length; i++) {
			System.out.print((2019+i)+"년도 : ");
			for ( int j = 0; j < sale[i].length; j++) {
				sale[i][j] = scan.nextInt();
				yearSum[i] += sale[i][j];
			}
			allSum += yearSum[i];
		}
		
		System.out.println("\t    c1사분기   2사분기   3사분기   4사분기  연간판매량  누적판매량");
		for ( int i = 0; i < sale.length; i++ ) {
			System.out.print((2019+i)+"년도 :");
			for ( int j = 0; j < sale[i].length; j++) {
				System.out.printf("   %5d", sale[i][j]);
			}
			System.out.printf("   %5d\t%5d\n", yearSum[i], allSum);
		}
	}

}
