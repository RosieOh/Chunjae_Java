package sec2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// PrinterWriter : 출력을 버퍼, 한 줄, 한 글자, 문자열 등의 모든 단위의 파일의 쓰기 작업
public class PrinterWriteEx1 {
    public static void main(String[] args) {
        try {
            File file = new File("out4.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fw);

            writer.write("점심시간 10분 전");
            writer.println("점심시간 10분 전");
            writer.print("점심시간 10분 전");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
