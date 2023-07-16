package sec1;

public class Example2 {
    public static void main(String[] args) {
        //primitive type 변수 - no empty
            // 표현 범위가 있으며 표현범위를 벗어나면 오류
            // 반드시, 초기화 되어야 한다.
        // 나머지 -> 참조형 : 초기화 안해도 됨
         boolean a = true;                          // 논리형 변수 - 1byte
         byte b = 127;                              // 바이트 변수 - -128~127 - 1byte
         char c = 'k';                              // 문자 변수 - 2byte
         short d = 32767;                           // 반정도정수 : -32768~32767 2byte
         int e = 785367800;                         // 단정도정수 : 4byte
         long f = 7853678000L;                      // 배정도정수 : 4byte -> 8byte
         // 348670.2478 => + 10의 6승 X 3486702478
         float g = 3.141592f;                       // 단정도실수 -> 4byte
         double h = 3.141592;                       // 배정도실수 -> 8byte
         double i = 3.1415920000000000008d;
         //-128~-1, 0~127 == 넘으면 오버플로우, 낮으면 언더플로우


        // 표현범위 : -2의 n-1승 ~ 2의 n-1 승 - 1

         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
         System.out.println(f);
         System.out.println(g);
         System.out.println(h);
         System.out.println(i);
    }
}
