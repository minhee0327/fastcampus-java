package chapter06.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("a.txt");
            System.out.println("read");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return; //return이 있더라도 항상 finally 는 수행됨. 대신 try-catch 끝나고 난 이후는 수행 되지 않음.
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
