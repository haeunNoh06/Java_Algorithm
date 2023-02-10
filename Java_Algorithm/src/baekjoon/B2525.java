package baekjoon;

import java.util.Scanner;
import java.util.Calendar;
class B2525{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar today = Calendar.getInstance();
        
        int minute = today.get(Calendar.MINUTE);
        int hour = today.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour+" "+minute);
        int necTime = scan.nextInt();// 요리에 필요한 시간(necessary)
        
        if ( (necTime+minute) >= 60) {
            hour += (necTime+minute)/60;
            if (hour == 24)
                hour = 0;
            minute = (necTime+minute)%60;
        } else {
            minute += necTime;
        }
        System.out.println(hour+" "+minute);
    }
}
