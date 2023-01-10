package school;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생수 입력 : ");
		int headcount = scan.nextInt();
		System.out.println();
		
		int[][] score = new int[headcount][3];
		
		// 점수 입력
		for ( int i = 0; i < headcount; i++) {
			for ( int j = 0; j < score[i].length; j++) {
				int cnt = 0;
				do {
					if ( cnt != 0) System.out.print("다시 입력하세요==> ");
					System.out.print("점수 "+(j+1)+" 입력 : ");
					score[i][j] = scan.nextInt();
					cnt++;
				}while (score[i][j] > 100 || score[i][j] < 0);
			}
			System.out.println();
		}
		
		// 출력
		System.out.println("====================================");
		System.out.println("순번   점수1   점수2   점수3   최고점   평점");
		
		for ( int i = 0; i < headcount; i++) {
			int max = score[i][0];
			System.out.printf("%2d    ", (i+1));
			for ( int j = 0; j < score[i].length; j++) {
				if ( max < score[i][j]) max = score[i][j];
				System.out.printf("%3d    ", score[i][j]);
				
			}
			System.out.printf("%3d    ", max);
			switch (max/10) {
			case 10:
			case 9: 
				System.out.print(5);
				break;
			case 8: 
				System.out.print(4);
				break;
			case 7: 
				System.out.print(3);
				break;
			case 6: 
				System.out.print(2);
				break;
			default:
				System.out.print(1);
			}
			System.out.println();
		}
		System.out.println("====================================");
	}

}
