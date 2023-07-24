package sec1;

public class ApiEx1 {
    public static void main(String[] args) {
        /*
        java.lang 패키지 : 별도의 import 과정이 필요 없는 기본 클래스

        Object : 자바에서 최상위 클래스
        System : 기본 입출력(키보드 입력, 모니터 출력), JVM 동작 제어
        Class :  외부 라이브러리의 특정 클래스를 로딩할 때
        String : 문자열을 다루기 위한 클래스
        StringBuffer / StringBuilder : 문자열 조작(분리/합치기/구조변화) 클래스
        Math : 수학/삼각을 위한 처리 클래스
        Wrapper : Primitive를 클래스로 변환 목적, Character, Byte, Short, Integer, Long, Float, Double, Boolean
                  등으로 구성되어 있으며, Primitive Type은 멤버를 가질 수 없으므로 Reference Type인 해당 Wrapper을 활용하여
                  메서드를 활용할 수 있다.
         */
        int a = 1004;       // Primitive Type
        Integer b = 1004;   // Wrapper Type

        int a1 = b; // UnBoxing : Wrapper -> Primitive
        Integer b1 = a;     // Boxing : Primitive -> Wrapper

        String val1 = "1004";
        // int va12 = Integer.parseInt(val1);  // String 데이터를 Integer형으로 변환
        boolean res = isInteger(val1);
        System.out.println("변환가능한 숫자인지 판단: + res");
        if(res) {
            int va12 = Integer.parseInt(val1);
            System.out.println("결과값 : " + va12 );
        }

        String val3 = "365.24781";
        res = isDouble(val3);
        System.out.println("변환 가능한 숫자인지 판단 : "+res);
        if(res) {
            double va14 = Double.parseDouble(val3);
            System.out.println("결과값 : " + va14 );
        }
    }

    public static boolean isInteger(String val1) {
        try {       // 만약에
            Integer.parseInt(val1);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isDouble(String val1) {
        try {
            Double.parseDouble(val1);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
