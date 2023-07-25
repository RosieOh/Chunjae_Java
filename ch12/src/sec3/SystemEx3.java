package sec3;

public class SystemEx3 {
    public static void main(String[] args) {
        // 성능 평가 기준
        // 성능 측정 : 처리능력(Throughtput), 반환시간(Turn Around Time)
        // 사용 가능도(Availability), 신뢰도(Reliability)
        long tot = 0;
        // long start = System.currentTimeMillis();        // 1/1000 -> 속도가 빨라서 측정이 되지 않음
        long start = System.nanoTime();                    // 1/100000000
        for(int i=0; i<100000; i++){
            System.out.println(i);
            tot += i;
        }
        long end = System.nanoTime();
        System.out.println("누적 결과 : "+tot);
        System.out.println("걸린 시간 : "+(end - start)+"ns");
    }
}
