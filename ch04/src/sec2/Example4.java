package sec2;


import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
    //문자열 함수 188p
        String code = "801225-1278001";
        char m = code.charAt(7);           // 특정 인덱스에 있는 문자 반환
        String gender = (m=='1' || m=='3') ? "남" : "여"; // 삼항연산자 사용
        String yy = code.substring(0, 2); // 연도를 의미 yy = 80, 특정 번째(begin index) 부터 특정 번째 전(enx index)까지 추출
        String mm = code.substring(2, 4); // 월을 의미 mm
        String dd = code.substring(4, 6);
        System.out.println("성별 코드 = "+m);
        System.out.println("성별 : "+gender);
        System.out.println("생년월일 :"+(yy+"-"+mm+dd));
        // 80-12-25

        String nick = "ohtaehun";
        int idx = nick.indexOf('t');        // 해당 문자의 인덱스를 반환
        System.out.println("t의 문자 인덱스 값 : "+idx);
        idx = nick.indexOf('e');        // 해당 문자의 인덱스를 반환
        System.out.println("e의 문자 인덱스 값 : "+idx);
        idx = nick.lastIndexOf('e');
        System.out.println("e의 마지막 찾은 경우의 인덱스 값 : "+idx);

        String name1 = nick + " imperial"; // 문자열 결합 연산
        String name2 = nick.concat(" imperial"); // 문자열 결합 연산

        // char[] nArr = nick.getBytes(""); 문자열을 => 문자배열 o t a e h u n 분리됨
        // 문자열을 문자열 배열로 : toCharArray()
        // 문자열을 바이트배열로 : getBytes();
        char[] nArr = nick.toCharArray();
        byte[] bArr = nick.getBytes();

        System.out.println("@ 2번째 : "+nArr[2]);     //t
        System.out.printf("# 2번째 : %s", +bArr[2]);  //116 -> t의 아스키 코드값

        int age = 43;
        float ht = 176.8f;
        boolean ps = true;

        // 특정 타입의 데이터를 문자열로 변환 => valueOf()
        String val1 = String.valueOf(age); // 정수 -> 문자열로 변환
        String val2 = String.valueOf(ht);  // 실수 -> 문자열로 변환
        String val3 = String.valueOf(ps);  // 부울 -> 문바열로 변환

        if(val1.equals("43")) System.out.println("문자열 반환 성공");

        // 대문자로(toUpperCase()) / 소문자로(toLowerCase())
        System.out.println("대문자로 변환 : "+nick.toUpperCase());
        System.out.println("소문자로 변환 : "+nick.toLowerCase());

        // 해당 특정 문자를 찾아 바꾸기 => replace(찾는 문자, 바꿀문자)
        String nick2 = nick.replace('O', 't');
        System.out.println("바뀐 값 : "+nick2);

        String chunjae1 = "오세훈/오태훈/이은영/서광/이소윤/신예은";
        String chunjae2 = "백준철-신승원-구예진-한선-박진관-박나연";

        // 문자열 배열을 특정 구분자로 요소 분리 => split
        String[] stArr1 = chunjae1.split("/");
        String[] stArr2 = chunjae2.split("/|-"); //regex

        // 문자열 배열을 출력 => Arrays.toString(문자열 배열)
        System.out.println(Arrays.toString(stArr1));
        System.out.println(Arrays.toString(stArr2));

        // 글자수 공백 포함
        String data1 = "           Oh       ";
        String data2 = "hoon              ";
        String data3 = "       tae       ";

        // 공백 제거
        // 해당 문자열의 앞 뒤의 공백 제거 --> trim()
        String trans1 = data1.trim();
        String trans2 = data2.trim();
        String trans3 = data3.trim();

        // 글자수랑 공백 제거하고
        System.out.println("글자수1 : "+data1.length());
        System.out.println("글자수2 : "+data2.length());
        System.out.println("글자수3 : "+data3.length());
    }

}
