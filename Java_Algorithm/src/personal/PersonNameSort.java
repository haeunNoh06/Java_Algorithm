package personal;

import java.util.Arrays;

public class PersonNameSort {

	public static void main(String[] args) {

		String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";// 주어진 문자열
		String[] test = str.split(",");
		String[] name = new String[test.length];
		
		int kim = 0;// 김씨
		int lee = 0;// 이씨
		int lJY = 0;// 이재영
		int total = 0;
		
		// 처리
		Arrays.sort(test);// 오름차순 정렬
	
		String std = test[0];
		int nameIdx = 1;
		name[0] = std;
		for (int i = 0; i < test.length; i++) {
			// 김씨 이씨 명수 세기
			if ( test[i].substring(0, 1).equals("김"))
				kim++;
			else if ( test[i].substring(0, 1).equals("이")) {
				lee++;
				if ( test[i].equals("이재영"))
					lJY++;
			}
			
			if ( std.equals(test[i])) {
				continue;
			}
			name[nameIdx++] = test[i];
			std = test[i];
		}
		
		// 출력
		System.out.println("김씨 : "+kim);
		System.out.println("이씨 : "+lee);
		System.out.println("이재영 : "+lJY);
		System.out.print("중복 제거하고 오름차순 정렬한 이름 : ");
		for (int i = 0; i < name.length; i++) {
			if ( name[i] == null ) break;
			System.out.print(name[i]+" ");
		}
	}

}
