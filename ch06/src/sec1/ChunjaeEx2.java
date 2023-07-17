package sec1;

public class ChunjaeEx2 {

    public static void main(String[] args) {
        Chunjae c1 = new Chunjae();

        // c1.no = 10; - private 이므로 같은 클래스 내부에서만 접근 가능하므로 접근 불가
        c1.partNo = 1234; // default 이므로 같은 패키지에서만 접근 가능하므로 접근 가능
        c1.point = 200; // protected 이므로 같은 패키지에 있거나 상속 관계에 있을 때만 가능하므로 접근 가능
        c1.name = "오태훈";  // public 이므로 어느 패키지나 클래스에 관계없이 모두 접근 가능하므로 접근 가능
        System.out.println(Chunjae.PI * 20 * 20);

        // public > protected > default > private

        Taehun t1 = new Taehun(); // 같은 패키지에 있는 클래스가 아니므로 사용 불가
        Chanwon ch1 = new Chanwon();

        int[] k = new int[100];

        Taehun[] t = new Taehun[10]; // 객체 배열 t[0], t[1] ~ t[9]
        // t[0].num ~ t[9].num
        // t[0].data ~ t[9].data

        for(int a=0;a<t.length;a++){  // 객체의 배열은 원소를 재생성해야함
            t[a] = new Taehun();
            t[a].setNum(a+1);
            t[a].setData("태훈" +(a+1));
        }

        for(int a = 0; a<t.length; a++) {
            System.out.println(t[a].getNum());
            System.out.println(t[a].getData());
            System.out.println("-----------------------------------------");
        }
    }
}
