package sec2;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {
        Date today = new Date();

        //new = 객체 생성
        String data1 = "2023-07-13"; // 기본 변수 타입
        String data2 = new String("2023-07-13"); // 레퍼런스 타입

        if(data1==data2) System.out.println("서로 같음");
        else System.out.println("서로 같음");

        // 문자열과 객체 타입은 값이 같다고 하더라도 등호(==) 비교할 수 없다.
        // 값 비교를 위해서는 equals()를 사용하여 비교하여아한다.
        if(data1.equals(data2)) System.out.println("서로 같음");
        else System.out.println("서로 다름");

        String info = "";
        String name = "오태훈";
        int age = 26;
        float ht = 177.8f;

        // 숫자에 문자 하나라도 더하기가 되면 문자열로 변환된다/
        info = name + age + ht;
        System.out.println("info="+info);
    }
}