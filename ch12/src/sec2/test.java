package sec2;

import java.util.Calendar;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("년도를 입력하세요 : ");
        int year = sc.nextInt(); //년도
        System.out.println("월을 입력하세요 : ");
        int month = sc.nextInt(); //월

        cal.set(Calendar.YEAR, year); //입력받은 년도로 세팅
        cal.set(Calendar.MONTH, month); //입력받은 월로 세팅

        System.out.println("---------["+month+"월]---------");
        System.out.println("   일      월      화      수      목     금      토");

        cal.set(year,month-1,1);


        int end = cal.getActualMaximum(Calendar.DATE);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);


        for(int i=1; i<=end; i++) {
            if(i==1) {
                for(int j=1; j<dayOfWeek; j++) {
                    System.out.print("    ");
                }
            }
            if(i<10) {
                System.out.print(" ");
            }
            System.out.print(" "+i+" ");
            if(dayOfWeek%7==0) {
                System.out.println();
            }
            dayOfWeek++;
        }
        System.out.println("-----------------------------");
    }
}
