package sec2;
// 제너릭의 제한 -> <T extends 제한 클래스>
// 제한 클래스의 서브(이하) 클래스만 생성이 허용됨
public class Multi3 {
    public static void main(String[] args) {
        // Child<Parent> c1 = new Child<Parent>();             // My 이하로만 제약 범위가 가능하므로 Parent는 오류
                                                               // 자기 자신은 만들 수 없다.
                                                               // 상속으로는 만들 수 있음.
                                                               // == 제네릭의 제한 ==
        Child<My> c2 = new Child<>();
        Child<Season> c3 = new Child<>();
    }
}
