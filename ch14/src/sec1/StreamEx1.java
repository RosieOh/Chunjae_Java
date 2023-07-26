package sec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

// Stream(스트림) : 바이트열 단위로 입력하거나 출력하는 클래스
public class StreamEx1 {
    public static void main(String[] args) {
        // Input -> 파일에 있는 자료를 가져오기 - InputStream(FileInputStream, ByteArrayInputStream, FilterInputStream)
        // Output -> 파일에 자료를 저장하기 - OutputStream(FileOutputStream, ByteArrayOutputStream, FilterOutputStream)
        // byte[] bArr = new byte[100];
        try{
            FileOutputStream fos = new FileOutputStream("out1.txt");
            fos.write(65);        // "A" 바이트 코드값 고려
            fos.write(66);        // "B" 바이트 코드값 고려
            fos.write(67);
            fos.write(115);
            fos.write(127);       // 키보드 키캡 문자열 
            fos.write(65);
            fos.write(69);
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("파일이 존재 하지 않거나 경로가 틀렸습니다.");
        }

        try {
            FileInputStream fis = new FileInputStream("out1.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("\t입력 파일이 존재하지 않거나 경로가 틀렸습니다.");
        }
    }
}
