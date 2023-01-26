package doit_algorithm;

import java.util.Scanner;

public class average002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int subjectNum = scan.nextInt();
		int[] score = new int[subjectNum];
		
		double sum = 0.0;
		for(int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		
		int max = score[0];
		for(int i = 1; i < score.length; i++) {
			if ( max < score[i]) max = score[i];
		}
		
		for (int i = 0; i < score.length; i++) {
			sum += (double)(score[i])/max*100;
		}
		
		System.out.println(sum/subjectNum);
	}

}
