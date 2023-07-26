package sec2;
@FunctionalInterface
interface MyLambda6<T, Q> {        // 제네릭
    Q calc(T x, T y); // 너 T야?
}
public class LambdaEx6 {
    public static void main(String[] args) {
        // 곱하기 // 더하기 // 나누기 // 뺴기
        MyLambda6<Integer, Integer> plus = (x, y) -> {
            return x+y;
        };
        MyLambda6<Integer, Integer> minus = (x, y) -> {
            return x-y;
        };
        MyLambda6<Integer, Double> div = (x, y) -> {
            return (double) x/y;
        };
        MyLambda6<Integer, Double> mul = (x, y) -> {
            return (double) x*y;
        };
        MyLambda6<Integer, Integer> mod = (x, y) -> {
            return x%y;
        };

        System.out.println("더한 결과 :" + plus.calc(30, 60));
        System.out.println("뺀 결과 :" + minus.calc(30, 60));
        System.out.println("나눈 결과 :" + div.calc(30, 60));
        System.out.println("곱한 결과 :" + mul.calc(30, 60));
        System.out.println("나눈 나머지 결과 :" + mod.calc(30, 60));
    }
}
