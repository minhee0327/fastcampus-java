package chapter06.ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        rf.writeInt(100);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());    //4byte 이동 (4)
        rf.writeDouble(3.14);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());    //8byte 이동 (12)
        rf.writeUTF("안녕하세요");
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());    //한글 modified utf 8 (java) 는 3 byte 씩 사용
                                                                        // 마지막 null: 2 byte [따라서 총 17 byte 이동]

        rf.seek(0);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("파일 포인터 위치: " + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

    }
}
