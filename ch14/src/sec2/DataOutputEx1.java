package sec2;

import java.io.*;
// 파일 생성 클래스 : File, Files(Path), FileOutputStream
// DataOutputStream : 한글과 같은 캐릭터셋을 지정하여 출력할 수 있음. => 기본 타입 : UTF-8
public class DataOutputEx1 {
    public static void main(String[] args) {
        try {
            File file = new File("out7.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);

            dos.writeUTF("한글 꺠지지 말쟈");
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
