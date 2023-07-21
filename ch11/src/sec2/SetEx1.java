package sec2;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1 = new TreeSet();
        // 데이터 중복X, 순서 유지 X - 인덱스 즉, 순번이 없기 때문에 뒤죽박죽
        Set<String> set2 = new HashSet<>();
        set2.add("이씨");
        set2.add("박씨");
        set2.add("조씨");
        set2.add("고씨");
        set2.add("김씨");
        set2.add("정씨");
        System.out.println("--------------------Set 결과 ---------------------");
        // 이터레이터
        Iterator it = set2.iterator();
        while(it.hasNext()) {                   // 이터레이터가 들어가 있을때 hasNext() 사용
            System.out.println(it.next());
        }

        // 데이터 중복O, 순서 유지 O
        List<String> ls2 = new ArrayList<>();
        ls2.add("이씨");
        ls2.add("박씨");
        ls2.add("조씨");
        ls2.add("고씨");
        ls2.add("김씨");
        ls2.add("정씨");
        System.out.println("--------------------List 결과----------------------");
        for(String d:ls2) {
            System.out.println(d);
        }
    }
}

// 로또 추첨 번호에 사용
