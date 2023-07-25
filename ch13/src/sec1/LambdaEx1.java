package sec1;


// p728 파이지 참고
public class LambdaEx1 {
    public int method1(int x, int y) {
        return x*y;
    }
    /*
    // 람다식 구현체
    (x,y) -> { x*y };

    // 람다식 종류
    () -> { }   :  Basic
    (x) -> { }  :  Consumer
    () -> { x } :  Supplier
    (x) -> { x*x }  :
        Operator : 주로 매개변수를 전달받아 처리를 한 후 다시 반환하는 타입
        Function : 주로 매개변수를 받아 처리한 후 그 결과를 형변환하여 반환하는 타입
        Predicate : 주로 매개변수를 받아 비교한 후 일치하는지 여부를 논리값으로 반환하는 타입
    */

}
