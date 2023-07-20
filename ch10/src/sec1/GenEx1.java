package sec1;

public class GenEx1 {
    public static void main(String[] args) {       // String이든 int든 이것저것 오게 하는 것이 String
        Gen1 g1 = new Gen1();
        g1.method1("오태훈");              // ''는 char이기 때문에 불가

        // 일반 클래스로 만들어진 필드의 값은 오로지 한가지 타입 밖에 지원하지 않으므로 t 필드는 String 이므로 setT()의 저장되는 값은 String 으로만 저장해야한다.
        //  g1.setT(20);
        g1.setT("오태훈");
    }
}
