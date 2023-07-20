package sec2;
// 멀티 쓰레드
// Runnable : 실행 가능한 객체를 만들기 위한 인터페이스 - 사용자 상속받아 새로운 클래스를 생성하여 활용
class SBRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"오태훈", "신예은", "김현경", "김보경", "박진권", "신짱구"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 퇴실 체크
        for(String name:str) {
            System.out.println("퇴실 체크 : "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// 출석 체크
class SCRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"오태훈", "신예은", "김현경", "김보경", "박진권", "신짱구"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 퇴실 체크
        for(String name:str) {
            System.out.println("출석 체크 : "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Run1 {
    public static void main(String[] args) {
        Runnable sbRun1;                    // 선언부
        sbRun1 = new SCRunnable();          // 생성부
        Thread t1 = new Thread(sbRun1);
        t1.start();

        Runnable scRun2;
        scRun2 = new SBRunnable();
        Thread t2 = new Thread(scRun2);
        t2.start();
    }
}

// 멀티 쓰레드 시간 테스트
//              wait time
//  한선         500
//  오세훈       1000
//  이소윤       500 + 1500
//  신예은       1000 + 1000
//  이은영       1000 + 1000 + 1000
//  박나연       500 + 15000 + 1500
//  .....
