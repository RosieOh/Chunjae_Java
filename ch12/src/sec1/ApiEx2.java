package sec1;

import java.text.SimpleDateFormat;      // 표시 형식
import java.util.Calendar;
import java.util.Date;

public class ApiEx2 {
    public static void main(String[] args) {
        /*
        java.util 패키지 : java.lang 패키지의 추가 기능판으로 대부분 import가 필요한 클래스로 구성된다.
        // Arrays : 배열을 효율적으로 다루기 위한 클래스
        // Calendar : 날짜(달력)과 관련된 데이터를 다루기 위한 클래스 => 복수형
        // Date : 날짜와 관련된 데이터를 다루기 위한 클래스 => 단일형
        // Objects : 여러 객체를 한번에 다루기 위한 클래스
        // StringTokenizer : 문자열 객체들을 다루기 위한 클래스
        // Random : 난수들을 다루기 위한 클래스
        // Collection : List, Set, Map, Stack, Queue, Deque ...
        // ...  줜나 많음....
         */
        Date now = new Date();      // 현재 날짜와 시간
        System.out.println(now);

        // 날짜를 String으로 변환
        String strNow = now.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        // String today1 = sdf.format(strNow);             // 자바8 미만
        String today2 = sdf.format(now);                   // 자바8 이상
        // System.out.println("문자열에 표시형식 날짜로 표시 : "+today1);
        System.out.println("날짜에 표시형식 문자로 표시 : "+today2);

        int y = now.getYear() + 1900;
        int M = now.getMonth() + 1;
        int d = now.getDate();
        int w = now.getDay();
        int h = now.getHours();
        int m = now.getMinutes();
        int s = now.getSeconds();
        System.out.println(y + "년" +M+ "월 "+d+"일"); // 0부터 시작
        System.out.println(h + "시" +m+ "분 "+s+"초");

        // Calendar cal = new Calender(); - 자바8 이상은 추상체와 정적 구조로 구성되어 있으므로 별도의 객체를 생성하지 않는다.
        Calendar n = Calendar.getInstance();

        // 자바8 이상은 LocaleDate을 활용하여 시간대나 지역의 지역성을 나타냄
    }
}
