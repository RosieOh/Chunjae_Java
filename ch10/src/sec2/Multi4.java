package sec2;

import java.util.List;
import java.util.Objects;

public class Multi4 {
    public void method1(List<?> lst) {                      // <?> : 어떤 타입이 와도 상관 없다는 의미 - 와일드 카드
        for(Object obj : lst) {
            System.out.println(obj + "\t");
        }
    }

    public int method2(List<? extends Number> lst) {        // 목록의 합계
        int hap = 0;
        for(Number i:lst) {
            hap += i.doubleValue();                         // 실수를 구하기 위한 메소드
        }
        return hap;
    }

    public List<? super Integer> method3(List<? super Integer> lst){
        for(int i=0; i<5; i++) {
            lst.add(i);
        }
        return lst;
    }
}
