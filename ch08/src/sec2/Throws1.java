package sec2;

public class Throws1 {
    public static void main(String[] args) throws Exception {
        String name = null;
        nullCheck(name);

        int[] arr = new int[4];
        otherCheck(arr);

        String data = "920dhxogns";
        otherCheck(data);

    }

    public static void nullCheck(String a) throws NullPointerException {
        // 예외 상황이 되었을 경우 NullPointerException가 처리하게 됨
        System.out.println(a);
    }

    public static void otherCheck(int[] a) throws ArrayIndexOutOfBoundsException {
        System.out.println(a[5]);
    }

    public static void otherCheck(String a) throws NullPointerException, Exception {
        int data = Integer.parseInt(a); // 넣어준 a가 String
    }
}
