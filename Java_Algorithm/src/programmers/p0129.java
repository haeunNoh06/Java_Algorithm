package programmers;

import java.util.Arrays;

public class p0129 {

	public String solution(String s) {

		char[] alphabet = s.toCharArray();
		Arrays.sort(alphabet);
		return new StringBuilder(new String(alphabet)).reverse().toString();
	}

	public static void main(String[] args) {
		p0129 p = new p0129();
		System.out.println(p.solution("Zbcdefg"));
	}

}
