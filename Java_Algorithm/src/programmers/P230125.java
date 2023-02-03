package programmers;

public class P230125 {

	public int solution(int[][] sizes) {
        
        int width = 0, height = 0;
        
        for (int[] card : sizes) {
            width = Math.max(width, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        
        return width*height;
    }
	
	public static void main(String[] args) {
		P230125 p = new P230125();
		int[][] test = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(p.solution(test));
	}
}
