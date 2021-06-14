package chapter06.ch16;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        long millisecond = 0; //소요시간 계산용

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
            BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){

            millisecond = System.currentTimeMillis();

            int i;
            while((i = bis.read())!= -1){
                fos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(millisecond+" 소요");

        Socket socket = new Socket();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


    }
}
