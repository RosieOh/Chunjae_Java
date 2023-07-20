package sec1;

import java.util.ArrayList;

// Stack, Queue, Deque, Set, Map, List,...

public class ListEx1 {
    public static void main(String[] args) {
        String[] author = {"이씨", "박씨", "조씨", "고씨", "모씨", "김씨"};
        ArrayList<Board> lst = new ArrayList<>();
        Board bd1;
        for(int i=1; i<6;i++) {
            bd1 = new Board();
            bd1.setNo(i);
            bd1.setTitle("더미 제목 "+i);
            bd1.setContent("더미 글 내용" +i);
            bd1.setAuthor(author[i]);
            bd1.setResdate("2023-07-19");
            lst.add(bd1);
        }
        prt(lst);
    }
    public static void prt(ArrayList<Board> lst) {
        for(Board bd:lst) {
            System.out.println("글번호 : "+bd.getNo());
            System.out.println("글제목 : "+bd.getTitle());
            System.out.println("작성자 : "+bd.getAuthor());
            System.out.println("작성일 : "+bd.getResdate());
            System.out.println("----------------------------------------------");
        }

    }
}
