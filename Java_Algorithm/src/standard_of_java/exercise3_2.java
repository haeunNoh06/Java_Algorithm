package standard_of_java;

public class exercise3_2 {

	public static void main(String[] args) {

		int numOfApples = 123;// 사과의 개수
		int sizeOfBucket = 10;// 바구니에 담을 수 있는 사과 개수
		System.out.println(( numOfApples%sizeOfBucket > 0 ? numOfApples/10+1 : numOfApples/10));
	}

}
