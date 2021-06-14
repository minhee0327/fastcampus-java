package chapter06.ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요");

        int i;

        try {
            //InputStreamReader 문자를 바이트 단위로 읽을 수 있도록 돕는 보조스트림
            InputStreamReader irs = new InputStreamReader(System.in);
            while((i = irs.read()) != '\n'){
//                System.out.println(i);
                System.out.print ((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
