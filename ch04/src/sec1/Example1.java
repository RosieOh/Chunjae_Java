package sec1;

public class Example1 {
    public static void main(String[] args) {
        // 배열 - 메모리 할당
        int [] a;                               // 선언1 - 타입[] 배열명;
        int b[];                                // 선언2 - 타입 배열명[];

        int[] c = new int[3];                   // 선언3 - 타입[] 배열명 = new 타입[array(2)] -> 할당 ;
        int d;
        // System.out.println("a[0]=" +a[0]);   --> a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 때문에 오류
        System.out.println("a[0]="+ c[0]);       // 메모리 할당됨
        // System.out.println("d=" +d);         --> d는 primitive 타입이므로 반드시 초기화가 필요함
    }
}
