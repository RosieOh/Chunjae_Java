package sec1;
// Consumer
@FunctionalInterface
interface  MyLambda2 {
    void print(int x);
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyLambda1 lam1 = () -> {                // 하나의 람디식만 대입 가능
            System.out.println("비가 오는 날엔");
        };
        lam1.print();

        MyLambda2 lam2 = (x) -> {
            System.out.println("제곱 결과 : "+(x*x));
        };
        lam2.print(1004);
    }
}
