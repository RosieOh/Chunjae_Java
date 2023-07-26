package sec2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FilesEx1 {
    public static void main(String[] args) {
        try {
            Path pat = Paths.get("C:\\Users\\db400tea\\IdeaProjects\\ch14\\out6.txt");
            Files.write(pat, "I\'m dying of hunger".getBytes());            // Files 클래스의 write() 메서드는 static이므로 별도의 객체 생성이 필요 없음
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
