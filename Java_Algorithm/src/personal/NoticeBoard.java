package personal;

import java.util.Scanner;

public class NoticeBoard {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("게시물의 총 건수 : ");
		int noticeTotal = scan.nextInt();
		System.out.print("한 페이지에 보여줄 게시물 수 : ");
		int oneNoticeNum = scan.nextInt();
		
		int noticeTotalNum = (noticeTotal%oneNoticeNum != 0 ? noticeTotal/oneNoticeNum+1 : noticeTotal/oneNoticeNum);
		System.out.println("총 페이지 수는 "+noticeTotalNum+"입니다.");
		
	}

}
