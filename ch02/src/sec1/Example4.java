package sec1;

public class Example4 {
    public static void main(String[] args) {
        // 부호 32 16 8 4 2 1
        //      1  0 0 0 0 0 = 32
        //      0  0 1 1 1 0 = 14
        int a = 20; // 1 0 1 0 0
        int b = 14; // 0 1 1 1 0

        // 비트 연산 = 2진수
        // == 이진 연산
        System.out.println("a & b : "+(a&b));                   // 00100 => 4
        System.out.println("a | b : "+(a|b));                   // 11110 => 30
        System.out.println("~a : "+(~a));    // -21             // complement - 보수 : 반대의 위치에 있는 수
        System.out.println("a ^ b : "+(a^b));                   // 11010 => 26

        // 시프트 연산
        System.out.println("a>>2 : "+(a>>2));                   // 시프트 연산 - >> /2의 효과
        System.out.println("a<<2 : "+(a<<2));                   // 시프트 연산 - << *2의 효과
        System.out.println("a>>>2 : "+(a>>>2));                 // 시프트 연산 - "<<<" 3개짜리는 없음, ">>"와 결과값은 같다.
        // System.out.println("a<<<2 : "+(a<<<2)); // 시프트 연산 - 3개짜리는 없음
    }
}
