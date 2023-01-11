package school;

public class Rectangle {

	int x1, y1;
	int x2, y2;
	
	// 생성자
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	// 좌표 보여주기
	public void showRectangle() {
		System.out.println("사각형의 좌표는 왼쪽 위 ("+x1+","+y1+")");
		System.out.println("사각형의 좌표는 오른쪽 아래  ("+x2+","+y2+")");
	}
	
	// 둘레 구하기
	public int getRound() {
		return (x2-x1)*2 + (y2-y1)*2;
	}
	
	// 넓이 구하기
	public int getArea() {
		return (x2-x1)*(y2-y1);
	}
	
	public static void main(String[] args) {

		Rectangle t1 = new Rectangle(1,1,3,3);
		t1.showRectangle();
		System.out.println("사각형의 둘레 : "+t1.getRound());
		System.out.println("사각형의 넓이 : "+t1.getArea());
	}

}
