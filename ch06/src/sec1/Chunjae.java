package sec1;

class Chanwon {  // 생성자
    private int seq;
    private int data;

    public Chanwon() {
        this(1);
    }

    public Chanwon(int seq) {
        this(seq, 100);
    }



    public Chanwon(int seq, int data) {
        this.seq = seq;
        this.data = data;
    }
}
class Taehun { // getter/setter에 의한 접근
    private int num = 1;
    private String data = "오태훈";

    // getter : 필드에 저장된 값을 가져오는 역할
    // setter : 저장하는 역할
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
public class Chunjae {
    // 멤버 필드 = 변수, 상수
    private int no;
    protected int point;
    int partNo;
    public String name;
    public final static double PI = 3.141592;  // 상수 // static는 옆에 final이 붙어도 상관 없이 클래스 자체를 호출가능

    public void setValue(int no) { // private 멤버는 클래스 내부에서만 this로 접근 가능
        this.no = no; // this : 자기자신의 요소를 호출
    }
}
