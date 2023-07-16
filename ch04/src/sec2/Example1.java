package sec2;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int a = 0;
        int[] intArr = new int[3];
        double[] doubleArr = new double[3];
        boolean[] boolArr = new boolean[3];
        String[] strArr = new String[3];

        System.out.println("===========================================================");
        System.out.println("intArr =" +intArr);

        for(int b:intArr) {
            System.out.println(b);
        }
        // 대체 코드
        //  for(int i=0; i<intArr.length; i++) {
        //      System.out.println(i+"번째 데이터 :" +intArr[i]);
        //   }

        System.out.println("\n----------------------------\n");
        System.out.println("intArr : "+Arrays.toString(intArr));
        System.out.println("doubleArr : "+Arrays.toString(doubleArr));
        System.out.println("boolArr : "+Arrays.toString(boolArr));
        System.out.println("strArr : "+Arrays.toString(strArr));

        // 초기화를 안할 경우 null Point Exception 발생 -- 어떤 특정 변수에 null 값이 포함되었을 경우 생김
    }
}
