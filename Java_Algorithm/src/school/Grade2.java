package school;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int score[][] = new int[3][2];
		double avg = 0.0;// 평균
		
		for ( int i = 0; i < score.length; i++) {
			for ( int j = 0; j < score[i].length; j++) {
				System.out.print((i+1)+"학년 "+(j+1)+"학기 점수 입력 : ");
				score[i][j] = scan.nextInt();
				avg += score[i][j];
			}
		}
		
		System.out.printf("3년간 의 평균 : %.2f\n", avg/6);
	}

}
