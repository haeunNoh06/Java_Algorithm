package baekjoon;

import java.util.Scanner;
public class B25314 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int type = scan.nextInt();
        for ( int i = 1; i <= type/4-1; i++) {
            System.out.print("long ");
        }
        System.out.println("long int");
    }
    
}