// 싱글쓰레드

package sec1;
// 쓰레드(Thread) : 하나의 작업(Task) 또흔 하나의 실행 프로그램(Process)                       // IR = Instruction Register
// Multi Thread : 여러 개의 쓰레드를 동시에 진행 또는 실행할 수 있도록 한 실행 환경               // Register = 가산기, 기억하는 장치 - SRAM으로 구성
// Op-code(명령어코드) | Operand(데이터가 있는 주소) => Stack(스택)에 보관되어 처리             // CashMemory - 소량으로 기억하는 메모리
// 여러 일을 처리하려면 일의 순서를 정해야함 -> 스케줄링

// !!쓰레드의 프로세스 정리!!
// 생성(Create) -> 실행 대기(wait) -> 실행(Run) -> 선점대기(Blocking) -> 재실행(Wake Up) -> 종료(Complete)
// 환영 대기 : 계속 대기되는 상태(무한 루프)
public class Thread1 {
    public static void main(String[] args) {
        int[] arr = {95, 60, 85, 70, 90, 80};
        String[] str = {"김기태", "이슬비", "박나연", "박진원", "오태훈", "신승원"};           // 전체 쓰레드는 6개
        for(int i=0; i<arr.length; i++){
            System.out.println("이름 : "+str[i]);         // 쓰레드의 시간을 벌기 위해
            // Thread.sleep(500); // More action - Surround Try/Catch
            try {
                Thread.sleep(500);                      // 대기시간 부여하고, 지정한 밀리초 만큼 Wain되며, 그 시간이 지나면 자동으로 Wake Up 된다. : 0.5초씩 딜레이
            } catch (InterruptedException e) {               // 쓰레드를 할 경우 InterruptedException 필요
                throw new RuntimeException(e);
            }
        }
    }

}
