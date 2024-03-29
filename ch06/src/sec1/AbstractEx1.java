package sec1;

public class AbstractEx1 {
    public static void main(String[] args) {
        // Man m1 = new Man(); - 추상화 클래스로는 인스턴스 생성 불가
        // 선언만
        Child c1;
        Descendant d1;
        Man m1;                         // 부모로 선언된 객체는 자식의 생성자로 객체 생성할 수 있음

        m1 = new Child();
        m1.method1();                   // 다형성
        m1 = new Descendant();
        m1.method1();                   // 다형성

        // 위와 같이 부모 클래스로 부터 선언된 객체는 자식 클래스의 생성자를 활용하여 객체 생성이 가능하며, 다른 자식 클래스의 생성자를 활용하여 형 변환도 가능

        // 형 변환할 때마다 그 형태가 그 형태가 다양하게 변할 수 있다. ==> 다형성
        // 생성자의 오버로딩, 메소드의 오버로딩, 상속에 의한 오버라이딩, 부모 클래스의 자식 형변환 => 다형성의 종류

        // c1 = new Man(); // 자식 클래스로부터 선언된 객체는 부모 생성자로 객체 생성자로 생성할 수 없다.
        // c1 = new Descendant();  // 형제 클래스로부터 선언된 객체는 형제 생성자로 객체 생성할 수 없다.

    }
}
