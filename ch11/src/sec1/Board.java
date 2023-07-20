package sec1;

// 목록을 불러와야 함
// 컬렉션 프레임워크 : 제네릭 등과 같은 클래스를 사용자가 사용하기 쉽게 맞춰놓은 모음
// 컬렉션 : 객체의 모음
// List : 목록
// Array List :
// 순서쌍 : 키-값
public class Board {
    private int no;
    private String title;
    private String content;
    private String author;
    private String resdate;
    private int cnt;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResdate() {
        return resdate;
    }

    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
