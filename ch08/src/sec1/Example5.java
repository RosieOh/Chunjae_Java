package sec1;

public class Example5 {
    static class Animal { }
    static class Tiger extends Animal { }
    static class Lion extends Animal { }

    public static void main(String[] args) {
        Animal ani;
        ani = new Tiger();
        ani = new Lion();

        Tiger tiger = new Tiger();
        changeObject1(tiger);

        Lion lion = new Lion();
        changeObject2(lion);
    }

    public static void changeObject1(Animal a) {
        try {
            Lion l = (Lion) a;    // 형변환
        } catch(ClassCastException e){
            System.out.println("형제나 다른 패키지에 있는 클래스의 객체로 형 변환 할 수 없습니다.");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changeObject2(Animal a) {
        try {
            Tiger t = (Tiger) a;            // 형변환
        } catch(ClassCastException e){
            System.out.println("형제나 다른 패키지에 있는 클래스의 객체로 형 변환 할 수 없습니다.");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
