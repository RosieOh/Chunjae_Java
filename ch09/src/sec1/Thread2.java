package sec1;

class SMThread extends Thread {
    @Override
    public synchronized void start() {                   // 쓰레드 생성
                                                         // synchronized : 동기화 블록(병행수행 가능)
        this.method1();                                  // 동기화 블록에 기재된 쓰레드들은 병행 수행된다.
        super.start();
    }

    @Override
    public void run() {                                  // 쓰레드로 실행할 내용을 기술
        int[] arr = {95, 60, 85, 70, 90, 80};
        for(int i=0; i<arr.length; i++){
            System.out.println("점수 : "+arr[i]);         // 쓰레드의 시간을 벌기 위해
            // Thread.sleep(500); // More action - Surround Try/Catch
            try {
                Thread.sleep(500);                      // 대기시간 부여하고, 지정한 밀리초 만큼 Wain되며, 그 시간이 지나면 자동으로 Wake Up 된다. : 0.5초씩 딜레이
            } catch (InterruptedException e) {               // 쓰레드를 할 경우 InterruptedException 필요
                throw new RuntimeException(e);
            }
        }
    }
    public void method1() {
        for(int i=1; i<7; i++){
            System.out.println(i);
        }
        try {
            Thread.sleep(500);                      // 대기시간 부여하고, 지정한 밀리초 만큼 Wain되며, 그 시간이 지나면 자동으로 Wake Up 된다. : 0.5초씩 딜레이
        } catch (InterruptedException e) {               // 쓰레드를 할 경우 InterruptedException 필요
            throw new RuntimeException(e);
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Thread th1 = new SMThread();
        th1.start();                    // 쓰레드 생성 후 자동 실행
    }
}
