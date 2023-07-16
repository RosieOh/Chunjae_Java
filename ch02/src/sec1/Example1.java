package sec1;

public class Example1 {
    public static void main(String[] args) {
        // 연산(Operation) : OPcode, Opereand ->  명령코드, 데이터가 있는 메모리 주소
        // 연산의 종류 : 산술연산, 대입연산, 증감연산, 관계연산, 논리연산, 비트연산, 기타연산

        // 산술연산 : +, -, *, /, %
        int a = 20;
        int b = 30;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;          // Integer이기 때문에 1.5는 저장 불가, 따라서 1로 저장된다.
        int g = b % a;

        System.out.println("a+b=" + c);
        System.out.println("a-b=" + d);
        System.out.printf("a*b=%d\n" , a * b);
        System.out.printf("b/a=%d\n", b/a);
        System.out.printf("b%%a=%d\n", g);

        // 대입연산 : =, +=, -=, *=, /=
        // 증감연산 : ++, -- 등의 전위와 후위가 존재
    }
}
