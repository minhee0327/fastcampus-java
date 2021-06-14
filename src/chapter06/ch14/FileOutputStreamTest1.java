package chapter06.ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")){
            fos.write('A');
            fos.write(66);
            fos.write('C');
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
