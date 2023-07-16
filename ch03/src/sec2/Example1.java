package sec2;

public class Example1 {
    public static void main(String[] args) {

        // 반복문 : 일부의 문장을 반복하여 처리해야하는 경우 활용
        // 1~100의 합계를 구할 경우에 더하는 문장 100줄을 넣는 것보다 반복문을 활용하는 것이 훨씬 효과적임.
        // 가령, i++; 를 100번 넣는 것보다 for(int i=0; i>100; i++){ }
        // 반복문의 종류 : for, while,
        // for(카운트 변수 선언 및 초기화; 조건; 증감식) { 문장; }
        // 해당 지정된 값 부터 조건이 만족하는 동안만 증가되면서 실행

        int sum = 0;
        for(int i=0; i<=100; i++) { // 반복문의 첫번째 문장 "int i = 0"은 1번만 실행된다.
            sum+=i; // sum=sum+i;
        }

        System.out.println("합산 결과 : " +sum);
        // sum = 0+1+2+3+4+5+6+7+8+9+10
        // 45


        // "무한루프 문장"
        // 1. for(int i=0; i<=100; i--) { 문장 } == 무한 루프에 빠짐
        // 2. for(;;) {  }

       // "2씩 증가"
        // for(int i=0; i<=100; i+=2) { 문장 }


        // System.out.println("i="+i); 지역 변수

        int arr[] = {90, 80, 85, 75, 95};                   // 큐 형태로 저장됨
        //          arr[0]  arr[1],...arr[4] -> 인덱스(순번)

        int tot1 = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        int tot2 = 0;
        for(int i=0; i<arr.length; i++) {
            tot2+=arr[i];
        }
        System.out.println("tot1="+tot1);
        System.out.println("tot2="+tot2);

        int hap = 0;
        for(int a=1; a<=100; a+=2) {
            hap+=a;
        }
        System.out.println("홀수의 합 : "+hap);

        int b = 1;
        hap = 0;
        for(;;) {
            hap += b;
            b += 2;
            if(b<=100) break;
        }
        System.out.println("홀수의 합2 : "+hap);

        hap = 0;
        for(int c=1; c<=100; c++) {
            if(c%2 == 1) {
                hap += c;
            } else {
                continue;
            }
        }
    }

}
