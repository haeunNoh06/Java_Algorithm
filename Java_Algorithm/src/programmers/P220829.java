package programmers;

import java.util.Arrays;

public class P220829 {

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];       //case개수만큼 answer배열 방 생성
        
        for ( int a = 0; a < commands.length; a++) {    
            int i = commands[a][0];                     //case별 i, j, k값을 읽어온다
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] itoj = new int[j-i+1];
    
            for ( int b = i, one = 0; b <= j; b++ ) {
                itoj[one++] = array[b-1];
            }
            Arrays.sort(itoj);
            answer[a] = itoj[k-1];        //k번째에 있는 값을 answer의 a번째 배열 요소에 저장
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		P220829 p = new P220829();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		System.out.println(p.solution(array,commands));
	}

}
