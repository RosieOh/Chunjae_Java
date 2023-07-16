package sec1;

public class Example2 {
    public static void main(String[] args) {
        int[] a = {90, 75, 80, 85};
        int b[] = {85, 100, 70, 90};

        int[] c = new int[4];
        c[0] = 100;
        c[1] = 100;
        c[2] = 100;
        c[3] = 100;
        //c[4] = 100;  // 예외 -> exception 발생, 데이터 전달은 가능하지만 출력은 불가

        int[] d;       // 선언만
        d = new int[]{90,80, 85, 60};   // 할당과 초기화
        //d[4] = 100;    // 추가 할당시에는 오류가 없으나 실제 할당이 되지 못해서 출력할 수 없음

        System.out.println("===========================================================");
        for(int i=0; i<a.length; i++) {
            System.out.println(i+"번째 데이터 : "+a[i]);
        }

        System.out.println("===========================================================");
        for(int i=0; i<b.length; i++) {
            System.out.println(i + "번째 데이터 : " + b[i]);
        }

        System.out.println("============================================================");
        for(int p:c){  // c가 갖고 있는 요소만큼 p로 전달 --> p=c[0], p=c[1]
            System.out.println(p);  // 몇번째라고는 입력 불가
        }
        // Index 4 out of bounds for length 4 --> syntax_error가 아닌 (예외)exception 오류 문법적 오류x
        // ArrayIndexOutOfBoundsException
        // 예외처리를 하는 이유 : 예외처리 후 시스템 에러가 생길 수 있기 때문에 사전에 예외처리를 진행
        // 시스템 에러 : 하드웨어 뿐만이 아닌 소프트웨어에서도 에러가 생기는 것
        // 오류와 장애의 차이?

        for(int p:d) {
            System.out.println(p);
        }
    }
}
