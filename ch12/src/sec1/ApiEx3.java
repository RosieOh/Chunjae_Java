package sec1;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ApiEx3 {
    public static void main(String[] args) {
        // Month.random() : 0~1의 실수
        int su = (int) (Math.random()*44 + 1);  // 0부터 시작이기 때문에 -- 1~45
        System.out.println("임의의 수 : "+su);

        // 로또 추첨기
        int lotto[] = new int[6];               // 배열로 선언

        for (int i = 0; i<6; i++) {             // 6개의 숫자이기 때문에 6개까지만   // 갯수 반복문
            lotto[i] = (int) (Math.random()*44 + 1);  // 0부터 시작이기 때문에 -- 1~45
            for (int j = 0; j < i; j++) {       // 숫자 반복문
                if (lotto[j] == lotto[i]) {
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(lotto)); // 숫자를 문자열로 표현

        // 로또 추첨기2
        Set<Integer> lotto1 = new HashSet<>();
        while(true) {
            int num = (int) (Math.random()*44 + 1);
            lotto1.add(num);
            if(lotto1.size() == 6) {
                break;
            }
        }
        System.out.println(lotto1);

        // 로또 추첨기3
        Integer[] lotto3 = new Integer[6];
        for(int i=0; i<6; i++) {
            lotto3[i] = (int) (Math.random()*44+1);
            System.out.println(lotto3[i]);
        }

        // 로또 추첨기4
        // 중복성 해결을 위하여 배열을 Set으로 변환
        Set<Integer> gen = new HashSet<>(Arrays.asList(lotto3));

        // 중복된 변호가 있으면, 개수가 6개 미만이므로 6개 미만인 경우
        // 중복 없이 요소가 6개가 될 때까지 반복
        while(gen.size()<6){
            gen.add((int) (Math.random()*44+1));
        }
        // Set을 Array(배열)로 변환
        lotto3 = gen.toArray(new Integer[6]);
        Arrays.sort(lotto3);
        // Arrays.sort(lotto3, Collections.reverseOrder()); // 내림차순 정렬
        System.out.println(Arrays.toString(lotto3));


    }
}
