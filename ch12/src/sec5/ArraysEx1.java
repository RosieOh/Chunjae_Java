package sec5;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        char[] arr1 = {'k', 'i', 'm', 'j', 'a', 'v', 'a'};
        System.out.println(arr1);
        char[] arr2 = arr1;         // 얕은 복제
        // 얕은 복제 : 다른 곳(기억장소)에 같은 데이를 복제 하는 것이 아니라, 이미 저장되어있는 데이터에 주소만을 다른 변수에 저장
        System.out.println(arr2);
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(arr1==arr2);
        char[] arr3 = Arrays.copyOf(arr1, arr1.length);     // 모든 요소 복제 : 깊은 복제
        System.out.println(arr3);
        System.out.println(arr3.hashCode());
        System.out.println(arr1==arr3);     // 배열은 주소를 비교하게 됨
        System.out.println(Arrays.equals(arr1, arr3));      // 배열의 값을 비교하려면 Arrays.equals 사용

        System.out.println("==================================================");
        System.out.println("정렬 전");
        int[] points = {90, 100, 80, 75, 95, 85, 75};
        Arrays.sort(points);
        for(int p:points) {
            System.out.println(p);
        }
        System.out.println("==================================================");
        System.out.println("정렬 후");
        Arrays.sort(points);         // 정렬
        for(int p:points) {
            System.out.println(p);
        }
        System.out.println("80은 어디에? "+Arrays.binarySearch(points, 80));    // 이진 탐색 함수 Arrays.binarySearch()
    }
}
