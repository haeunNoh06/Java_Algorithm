package personal;

import java.util.Scanner;

public class Ex6_2_carPayment {

	public static double payParking(double inTime, double outTime) {
		
		double money = 1000;
		double time = outTime - inTime;

		if ( time <= 1 )
			return money;
		else {
			if ( time - 1 < 1 )
				money += 500;
			else
				money += (int)(((time-1)*10)/10) * 500 + 500 * (((time-1)*10)%10 > 0 ? 1 : 0 );
			if ( money > 10000 )
				money = 10000;
			return money;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String yOrN = "y";
		
		while ( yOrN.equals("y") ) {
			System.out.print("들어온 시간을 입력하세요: ");
			double inTime = scan.nextDouble();
			System.out.print("나간 시간을 입력하세요: ");
			double outTime = scan.nextDouble();
			System.out.println("주차요금은 "+payParking(inTime, outTime)+" 원입니다");
			System.out.print("계속하기를 원하세요? 그렇다면 y를 아니면 n을 입력하세요: ");
			yOrN = scan.next();
		}
	}

}
