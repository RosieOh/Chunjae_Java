package sec1;

// 추상화 클래스 - 부분 추상화 할때 사용:어떤것은 추상화 하고 어떤건 안하고 싶을 때
// 인터페이스 : 전체 추상화
public abstract class Man {
    private int item1;
    private String item2;

    // 추상화 : 실제 구현 내용을 적지 않고, 상속 받는 클래스에서 구현 내용을 기술하므로써
    // 물려받는 입장에서 쓰고 싶은 것이 다를 경우 미리 아래처럼 사용처를 정해버리면
    // 그대로 쓰든가 아니면, 오버라이딩을 해야함.
        // - 원하는 내용을 마음대로 구현
        // - 기능 서로 교체 가능 ~ 대신 추상클래스와 인터페이스를 거쳐야함
        // - 필수 기능을 선언해서 사용할 수 있음
    // ex) 그림에서의 추상화를 빗대어 생각하기!!

    // 선언만
    public abstract void method1();
    public abstract int method2();
    public abstract void method3(int no);
    public abstract int method4(int no);

    // 추상화 선언이 아니므로 구현 내용을 기술해야함
    public void method5() {
        System.out.println("M5");
    }
    public int method6() { return 100;}
    public void method7(int no) {
        System.out.println("매개값 : " +no);
    }
    public int method8(int no) { return no*(no-1); }
}
