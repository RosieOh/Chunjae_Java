package sec2;

public class Example2 {
    public static void main(String[] args) {
        /*
        int 카운트변수 = 0;
        while(조건식) {
            증감식;
            반복실행할 문장;
        }
         */

        int i = 0;
        int tot = 0;
        while(i<=100) {
            i++;
            tot+=i;
        }
        System.out.println("tot = "+tot);

        i = 0;
        tot = 0;
        // 무한루프 : 끝이 없이 계속 반복 실행되는 문장
        while(i>=0) {
            i++;
            tot+=i;
            if(i>=100) break;
        }
        System.out.println("tot2 = "+tot); // 무한루프에 빠지게 됨 => 항상 조건식이 만족하기 때문
    }
}
