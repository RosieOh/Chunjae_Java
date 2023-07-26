package sec3;

import java.io.FileReader;
import java.io.IOException;

// 파일을 읽어오는 방법 : FileReader, BufferedReader, Scanner, Files
public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("out5.txt");
        int rd;
        while((rd = fr.read()) != -1) {
            System.out.println((char) rd);
        }
    }
}
