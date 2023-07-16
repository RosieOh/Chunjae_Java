package sec2;

public class Example4 {
    public static void main(String[] args) {

        /*
            1  2  3  4  5  6  7
            8  9  10 11 12 13 14
            15 16 17 18 19 20 21
            22 23 24 25 26 27 28
            29 30 31
         */
        System.out.println("1번 문제");
        int cnt = 0;
        for(int a=1; a<=5; a++) {
            for(int b=1; b<=7; b++){
            cnt++;
            if(cnt>31) {
                break;
            } System.out.printf("%2d\t",  cnt);
            }
            System.out.print("\n");
        }
        // 이건 그냥 for문 두번 쓰는데까진 성공 근데 if(cnt>31) if문 해주는거 못해서 틀림

        System.out.println("===================================================================");
        /*
            *
            **
            ***
            ****
            *****
         */
        System.out.println("2번 문제");
        for(int a=1; a<=5; a++) {
            for(int b=1; b<=a; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // 이건 가뿐하게 맞음

        System.out.println("===================================================================");
        /*
            *****
            ****
            ***
            **
            *
         */
        System.out.println("3번 문제");
        for(int a=0; a<5; a++) {
            for(int b=0; b<5-a; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // b<5-a 연산자를 생각하지 못해서 틀림

        System.out.println("===================================================================");
        /*
            구구단
            2X1 = 2  3X1=3 ...... 9X1 =9
            ............................
            2X9 = 18
         */
        System.out.println("4번 문제");
        for(int a=1; a<=9; a++) {
            for(int b=2; b<=9; b++) {
                System.out.print(b +" * "+ a + " = "+ a*b + "\t");
            }
            System.out.print("\n");
        }
        // 가로 세로 못바꿔서 틀림
        // 결론 백준으로 연습하자
    }
}
