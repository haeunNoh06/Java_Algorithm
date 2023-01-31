package programmers;

import java.util.Arrays;

public class P230129 {

	public String solution(String s) {

		char[] alphabet = s.toCharArray();
		Arrays.sort(alphabet);
		return new StringBuilder(new String(alphabet)).reverse().toString();
	}

	public static void main(String[] args) {
		P230129 p = new P230129();
		System.out.println(p.solution("Zbcdefg"));
	}

}
