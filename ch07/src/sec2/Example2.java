package sec2;

// import sec1.Dbl;  // Dbl 클래스는 default 클래스 이므로 다른 패키지에서 접근 불가
import sec1.Outer;
import sec1.Outer.*;

public class Example2 {
    public static void main(String[] args) {
        Outer out1 = new Outer();
        out1.setItem1(100);
        out1.setItem2("오태훈");
        out1.method1();

        System.out.println("------------------------------------");

        // 외부 클래스. 내부클래스 인스턴스명, new 내부 클래스 생성자()
        Outer.Inner in1 = out1.new Inner();
        in1.setItem3(200);
        in1.setItem4(("천재"));
        in1.method2();


        // 이중 클래스인 Outer.java 안에 있는 Dbl 클래스의 객체를 생성하는 방법
        // out1.db        - Dbl 클래스 타입의 멤버 필드에 위한 생성
        // out1.getDbl(); - 메소드 호출에 의한 생성
    }
}
