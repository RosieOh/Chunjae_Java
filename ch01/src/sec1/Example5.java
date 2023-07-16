package sec1;

public class Example5 {
    public static void main(String[] args) {
        byte b1 = 104;
        // byte b2 = -129;          해당 표현범위보다 작음(언더플로우)
        // byte b3 = 128;           해당 표현범위보다 크면(오버플로우)

        char c1 = 'k';
        char c2 = 0;                // 언더플로우
        char c3 = 65535;            // 오버플로우

        short s1 = 32766;
        short s2 = -32768;           // -32768 <  -> 언더플로우
        short s3 = 32767;            //  32767 >  -> 오버플로우

        int i1 = 1000;
        int i2;                      //
        int i3;

        long l1 = 9223372036854775806L;
        long l2;
        long l3;

        float f1 = 3.4028235E37f;
        float f2;
        float f3;

        double d1 = 1.7976931348623157E308d;
        double d2;
        double d3;
    }
}
