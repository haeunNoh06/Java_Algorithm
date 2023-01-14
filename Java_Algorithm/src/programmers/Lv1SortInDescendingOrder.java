package programmers;

public class Lv1SortInDescendingOrder {
    public long lv1SortInDescendingOrder(long n) {
        
        String[] an = Long.toString(n).split("");// long을 String으로
        int[] num = new int[an.length];// 실제 정답 담을 배열
        
        for ( int i = 0; i < an.length; i++)
            num[i] = Integer.parseInt(an[i]);
        
        // 내림차순 정렬
        for ( int i = 0; i < num.length; i++) {
            for ( int j = 1; j < num.length-i; j++ ) {
                if ( num[j-1] < num[j] ) {
                    int tmp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = tmp;
                }
            }
        }
        
        String str = "";
        for (int i = 0; i < num.length; i++)
            str += Integer.toString(num[i]);
        
        return Long.parseLong(str);
    }
    
    // 예시
    public static void main(String[] args) {
    	Lv1SortInDescendingOrder ri = new Lv1SortInDescendingOrder();
        System.out.println(ri.lv1SortInDescendingOrder(118372));
    }
}