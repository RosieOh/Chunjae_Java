package sec4;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String str1 = new String();
        str1+="박씨";
        str1+="/";
        str1+="이씨";
        str1+="/";
        str1+="조씨";
        str1+="/";
        str1+="김씨";
        System.out.println(str1);
        
        StringBuffer str2 = new StringBuffer();
        str2.append("모씨");
        str2.append("/");
        str2.append("주씨");
        str2.append("/");
        str2.append("신씨");
        str2.append("/");
        str2.append("강씨");
        System.out.println(str2);

        str2.replace(0, 2,"민씨");
        System.out.println(str2);
        System.out.println(str2.toString());

        StringBuilder str3 = new StringBuilder();
        str3.append("일등병");
        str3.append("-");
        str3.append("이등병");
        str3.append("-");
        str3.append("삼등병");
        str3.append("-");
        str3.append("사등병");
        System.out.println(str3.toString());
        str3.insert(4, "오등병-");
        System.out.println(str3.toString());
        System.out.println(str3.substring(4, 7));
        System.out.println(str3.reverse());

        String str = str3.toString();       // String으로 형변환
        String[] str4 = str.split("-");
        System.out.println(Arrays.toString(str4));

    }
}
