package standard_of_java;

public class exercise4_15 {

	public static void main(String[] args) {
		
		int number = 12321;
		int tmp = number;
		
		String str = "";
		
		while (tmp != 0) {
			str += String.valueOf(tmp%10);// 문자열 변환
			System.out.println("tmp : "+tmp+", num : "+Integer.valueOf(str));
			tmp /= 10;
		}
		
		System.out.println((number==Integer.parseInt(str)? number+"는 회문수 입니다." : number+"는 회문수가 아닙니다."));
	}

}
