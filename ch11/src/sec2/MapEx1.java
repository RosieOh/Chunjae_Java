package sec2;

import java.util.*;
import java.util.Map.*;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Properties map4 = new Properties();

        // map
        map1.put("no", 1);
        map1.put("kor", 100);
        map1.put("eng", 70);
        map1.put("mat", 90);
        System.out.println(map1);
        // 추가하는 건 put, 가져오는건 get
        System.out.println("국어점수 : "+map1.get("kor"));      // 불러오는 것도 다르며, list, set, map이 다 각각 다름
        // 답은 중복이 되지만 키는 중복이 될 수 없다.

        // 항목이 있나 없나를 확인
        if(map1.containsKey("soc")){
            System.out.println("해당 키가 존재합니다.");          // 키에서 진행
        } else {
            map1.put("soc", 100);
        }
        if(map1.containsValue(100)) {
            System.out.println("만점 과목이 있다니뇨?");
        } else {
            System.out.println("만접 과목 없음");
        }

        System.out.println("===================================================================");

        // 맵의 순회
        for(Entry<String, Integer> eSet : map1.entrySet()) {            // 인덱스가 없기 때문
            System.out.println(eSet.getKey()+":"+eSet.getValue());
        }

        map2.put("name", "taehoon");
        map2.put("age", "29");
        map2.put("height", "176");
        map2.put("weight", "78.3");
        System.out.println(map2);
        if(map2.containsKey("weight")) {
            map2.remove("weight");      // 키가 제거
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }

        System.out.println("=============================================================");
        System.out.println("이름 : "+map2.get("name"));
        System.out.println("나이 : "+map2.get("age"));
        System.out.println("키 : "+map2.get("height"));
        System.out.println("몸무게 : "+map2.get("weight"));

        // 해시테이블(HashTable) 의 순회
        for(Entry<String, String> eSet : map2.entrySet()) {            // 인덱스가 없기 때문
            System.out.println(eSet.getKey()+":"+eSet.getValue());
        }
        System.out.println("==============================================================");
        map3.put("name", 1);
        map3.put("age", 29);
        map3.put("height", 176);
        map3.put("weight", 78);
        System.out.println(map3);
        if(map3.containsKey("weight")) {
            map3.remove("weight");      // 키가 제거
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 : "+map3.get("name"));
        System.out.println("나이 : "+map3.get("age"));
        System.out.println("키 : "+map3.get("height"));
        System.out.println("몸무게 : "+map3.get("weight"));

        // 트리맵(TreeMap) 의 순회
        for(Entry<String, Integer> eSet : map3.entrySet()) {            // 인덱스가 없기 때문
            System.out.println(eSet.getKey()+":"+eSet.getValue());
        }

        // CSS 속성 전달할 때 활용 - setProperty()
        map4.setProperty("margin", "40px");                             // 제네릭이 안되어 있을 경우 Integer은 String으로 들어감
        map4.setProperty("padding", "30px");
        map4.setProperty("width", "1200px");
        map4.setProperty("height", "50px");
        System.out.println("폭 : "+map4.getProperty("width"));           // 결과값은 속성값을 추가하여 산출
    }


}
