package school;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int A[] = new int[5];
		int B[] = new int[5];
		int AB[] = new int[A.length+B.length];// 병합된 데이터
		
		// 입력
		System.out.print("첫번째 배열의 데이타 : ");
		for ( int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
		}
		System.out.print("두번째 배열의 데이타 : ");
		for ( int i = 0; i < B.length; i++) {
			B[i] = scan.nextInt();
		}
		
		// 배열 병합
		for ( int i = 0; i < A.length; i++) {
			AB[i%5] = A[i];
			AB[i%5+5] = B[i];
		}
		
		// 오름차순 정렬
		for ( int i = 0; i < AB.length; i++) {
			for ( int j = 1; j < AB.length; j++) {
				if ( AB[j-1] > AB[j]) {
					int tmp = AB[j-1];
					AB[j-1] = AB[j];
					AB[j] = tmp;
				}
			}
		}
		
		// 중복 제거
		System.out.print("병합된 배열의 데이타 : "+AB[0]);
		for ( int i = 1; i < AB.length; i++) {
			if ( AB[i-1] == AB[i] ) {
				continue;
			}
			System.out.print(" "+AB[i]);
		}
	}

}
