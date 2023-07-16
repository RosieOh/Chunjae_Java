package sec2;

public class Example7 {
    public static void main(String[] args) {
        // byte(1)<char(2)<short(2)<int(4)<long(8)
        // float(4)<double(8)


        // 자동형변환(auto casting) : 해당 타입에서 크기가 같거나 더 큰 타입에 대입되었을 때 발생
        int data1 = 1004;                       // 정수형 타입
        float data2 = data1;                    // 실수형 타입으로 변수를 설정함으로써 타입이 변환됨

        char data3 = 'K';
        int data4 = data3;                      // 75번 유니코드 K -> 아스키코드로 변환

        // 강제 형변환 : 형변환 연산자를 활용하는 형변환 -- 가능하면 안 쓰는 것이 좋다. ~ 데이터의 신빙성이 떨어지기 때문
        int data5 = 2048;
        byte data6 = (byte)data5;               // (byte) : 형변환 연산자  --> 알 수 없는 데이터로 삽입

        System.out.println("data1= " +data1);
        System.out.println("data2= " +data2);
        System.out.println("data3= " +data3);
        System.out.println("data4= " +data4);
        System.out.println("data5= " +data5);
        System.out.println("data6= " +data6);
    }
}
