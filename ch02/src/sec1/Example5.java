package sec1;

import java.util.Date;

public class Example5 {
    public static void main(String[] args) {
        Date birth1 = new Date(); // 오늘 날짜 확인
        String birth2 = "2023-07-07";
        System.out.println(birth1);

        // birth1이 Date로 부터 만들어진 인스턴스인지 학인함.
        System.out.println("확인1 : "+(birth1 instanceof Date)); // Date 클래스로 만들어진 인스턴스 = 타입을 물어보는 형식
                                                                // 인스턴스 : 틀에 의해 만들어진 것
        //System.out.println("확인2 : "+(birth2 instanceof Date)); // 오류 이유 : birth가 Date로 부터 얻어진 인스턴스가 아니기 때문


        // 삼항 연산자 : 조건 ? 참 : 거짓
        // 항이 3개 이기 때문에 "삼항연산자"
        // ? 앞에는 조건, 비교식이 만족할 때 실행 ":" 다음은 만족하지 않을 때 실행
        int point = 84;
        String pan = point >= 80 ? "합격" : "불합격";
        System.out.println("판정 : "+pan);
    }
}
