package personal;

import java.util.Scanner;

public class ex01 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      
      int row, column;
      
      while(true) {
         System.out.print("행 인덱스 입력 >> ");
         row = scan.nextInt();
         System.out.print("열 인덱스 입력 >> ");
         column = scan.nextInt();
         
         if ( row >= 5 || column >= 5) break;
         
         System.out.print(" ");
         for ( int i = 0; i < row; i++)
            System.out.printf("%2d", i);
         System.out.println();
         
         for ( int i = 0; i < 5; i++) {
            System.out.print(i);
            for (int j = 0; j < 5; j++) {
               System.out.print(" ");
               if ( row == i && column == j )
                  System.out.print("X");
               else
                  System.out.print(" ");
            }
            System.out.println();
         }
         System.out.println();
      }
      System.out.println("종료되었습니다.");
   }
}
