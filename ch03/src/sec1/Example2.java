package sec1;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        // 점수 직접 입력
        Scanner sc = new Scanner(System.in); // 입력할 때 사용

        System.out.println("이름 입력 : ");
        String name = sc.nextLine();
        System.out.println("1번 과목 입력 : ");
        int js1 = sc.nextInt();
        System.out.println("2번 과목 입력 : ");
        int js2 = sc.nextInt();
        System.out.println("3번 과목 입력 : ");
        int js3 = sc.nextInt();

        // int js1 = 85, js2 = 90, js3 = 95
        float py = (js1 + js2 + js3) / 3.0f;
        System.out.println((js1 + js2 + js3) / 3.0f);

        /*
        if~else~
        if (조건식) {
            조건이 참일 때 실행할 문장;
        } else {
            조건이 만족하지 않을 때 실행할 문장;
        }
         */

        // 평균이 80점 이상이면, 합격, 아니면 탈락
        if(py>=80){
            System.out.println("합격");
        } else {
            System.out.println("탈락");
        }

        if(js1>=80 && js2>80 && js3>=80) System.out.println("장학금 대상");
        else System.out.println("장학금 대상자 아님");

        if(js1>=90 || js2>90 || js3>=90) System.out.println("과목 우수자");
        else System.out.println("과목 우수 아님 ");

        // if~else if~else~
        /*
        if (조건식1) {
                조건식1이 만족할 경우 실행할 문장;
        } else if(조건식2) {
            조건식1이 만족하지 않고, 조건식2가 만족할 경우 실행할 문장;
        } else if(조건식3) {
            조건식2이 만족하지 않고, 조건식3가 만족할 경우 실행할 문장;
        }
        .....
        } else {
            모든 조건이 만족하지 않을 경우 실행할 문장;
         */

        if(py>=90) {
            System.out.println("수");
        } else if(py>=80) {
            System.out.println("우");
        } else if(py>=70) {
            System.out.println("미");
        } else if(py>=60) {
            System.out.println("양");
        } else {
            System.out.println("집에 가");
        }

        if(py>=90) System.out.println("A");
        if(py<90 && py>=80) System.out.println("B");
        if(py<80 && py>=70) System.out.println("C");
        if(py<70 && py>=60) System.out.println("D");
        if(py<60) System.out.println("탕~!탕~!탕~!");

        int pt = (int) py / 10;
        String grade = "";

        // switch~case~break 문
        /*
        switch(기준식 또는 변수) {
            case 값1:
                 기준식 또는 변수의 결과값이 값1과 일치할 경우 실행할 문장;
                 break;
            .....
            case 값n:
                 기준식 또는 변수의 결과값이 값n과 일치할 경우 실행할 문장;
                 break;
            default;
                    기준식 또는 변수의 결과값이 어떠한 case에도 속하지 않는 경우 실행할 문장;
        }
        ※ 기준식 또는 변수의 결과값의 case의 값과 경우의 수가 같아야하며, 경우의 수가 같이 않는 경우 반드시 default를 설정하여야 하며, case의 종료는 break로 해야하며,
        break가 지정되지 않으면, 아래 case의 연산까지 모두 진행하게됨.
         */

        switch (pt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                grade = "5등급";
                break;
            case 6:
                grade = "4등급";
                break;
            case 7:
                grade = "3등급";
                break;
            case 8:
                grade = "2등급";
                break;
            case 9:
                grade = "1등급";
                break;
            default:
                grade = "판정 불가";
        }
        System.out.println("등급 : "+grade);
    }
}
