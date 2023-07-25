package sec4;

import java.util.StringTokenizer;

public class StringEx2 {
    public static void main(String[] args) {
        String mem1 = "이씨/박씨/김씨/구씨/서씨";
        String[] m1 = mem1.split("/");
        for(String name:m1) {
            System.out.println(name);
        }
        System.out.println();
        String mem2 = "조씨&나씨, 성씨, 고씨-윤씨";
        String[] m2 = mem2.split("&|, |-");
        for(String name1:m2) {
            System.out.println(name1);
        }
        System.out.println();
        String mem3 = "조씨&나씨, 성씨, 고씨-윤씨";
        StringTokenizer m3 = new StringTokenizer(mem3, "/");
        int cnt = m3.countTokens();
        for(int i=0; i<cnt; i++) {
            String token = m3.nextToken();
            System.out.println(token);
        }
    }
}
