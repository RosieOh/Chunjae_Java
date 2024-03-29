package sec1;

import org.w3c.dom.ls.LSOutput;

public class Example3 {
    // 원소 추가 함수 --> add()
    public static String[] add(String[] originArr, String txt) {
        String[] newArr = new String[originArr.length + 1];              // 새로운 배열은 원래 배열의 데이터에서 하나 더 증가
        for(int i=0; i< originArr.length; i++){                          // 원래 배열데이터를 새로운 배열에 전달하여 복제
            newArr[i] = originArr[i];
        }
        newArr[originArr.length] = txt;                                  // 추가되는 원소를 txt 변수로 입력받아 새로운 원소로 추가
        return newArr;
    }

    // 원소 제거 함수 remove()
    public static String[] remove(String[] originArr) {
        String[] newArr = new String[originArr.length - 1];              // 새로운 배열은 원래 배열의 데이터에서 하나 더 증가
        for(int i=0; i< originArr.length-1; i++){                        // 원래 배열데이터를 새로운 배열에 전달하여 복제
            newArr[i] = originArr[i];
        }
        return newArr;
    }

    // ============================================================================================================

    public static void main(String[] args) {
        // 원소 추가 요청
        String[] originArr = {"김기태", "박나연", "김이호", "오태훈", "서광"};        // 위 데이터는 위에 add(String[])로 감
        // originArr = new String[]{"신승원", "오세훈", "신예은", "김보경"};         // 값을 재초기화를 한꺼번에 할 수는 있으나
        // originArr[5] = "한선";                                                // 추가는 할 수 없음
        originArr = add(originArr, "한선");                                  // 함수를 호출해야 실행 가능
        originArr = add(originArr, "이슬비");                                // 함수를 호출할 때 원래 배열과 추가 데이터를 같이 대입
        for(String s:originArr) {                                               // String s 변수를 originArr로 선언
            System.out.println(s);
        }

        System.out.println("==============================================");

        // 원소 제거 요청
        originArr = remove(originArr);
        for (String s:originArr) {
            System.out.println(s);
        }
    }
}
