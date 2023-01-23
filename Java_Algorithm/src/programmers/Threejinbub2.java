package programmers;

public class Threejinbub2 {

	public int solution(int n) {
		int answer = 0;
		
		String str = "";
		/*
        45가 0이 될 때까지 3으로 나눈다
        45/3 15 0
        15/3 5 0
        5/3 1 2
        1/3 0 1
        
        -> 나눈 수를 str에 저장한다
        -> str의 수를 int로 변환한 뒤 배열에 넣는다
        -> 각 배열방의 값과 3*(3*i)를 연산하여 더한다
        -> answer을 리턴한다
		 */
		
		int num = n;
		while(num != 0) {
			str += Integer.toString(num%3);
			num /= 3;
		}
		System.out.println(str);
		
		String[] arr = str.split("");// 배열로 값 하나씩 담기
		System.out.println(arr.length);
		for ( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int idx = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			num = Integer.parseInt(arr[i]);// 정수로 변환
			answer += (int)(num*Math.pow(3, idx++));
			System.out.println("answer : "+answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		Threejinbub2 tj = new Threejinbub2();
		int num = tj.solution(45);
		System.out.println("10진수 : "+num);
	}

}