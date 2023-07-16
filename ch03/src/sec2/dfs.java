package sec2;

public class dfs {
    public static void main(String[] args) {
        int cnt = 0;
        System.out.println("1번 문제");
        for(int a=1; a<=5; a++) {
            cnt++;
            if(cnt>31) {
                break;
            } System.out.printf("%2d\t",  cnt);
        }
        System.out.print("\n");
    }
}


