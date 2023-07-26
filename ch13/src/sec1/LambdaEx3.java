package sec1;
// Supplier
@FunctionalInterface
interface MyLambda3 {
    String print();
}
public class LambdaEx3 {
    public static void main(String[] args) {
        MyLambda3 lam3 = () -> {
          return "오태훈";
        };
        System.out.println(lam3.print());
    }
}
