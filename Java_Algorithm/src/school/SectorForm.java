package school;

import java.util.Scanner;

class Sector {
	double PI = 3.14;
	int angle = 90;// 각도
	double radius;// 반지름
	
	public Sector(double r) {
		this.radius = r;
	}
	
	// 부채꼴 면적 계산
	double area() {
		return radius*radius*PI*0.25;
	}
	
	// 부채꼴 둘레 계산
	double circum() {
		return 2*PI*radius*0.25+(radius*2);
	}
	
}

public class SectorForm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		double r = scan.nextDouble();
		
		Sector s = new Sector(r);
		
		System.out.println("반지름 "+r+"인 부채꼴의 면적 : "+s.area()+" , 둘레 : "+s.circum());
	}

}
