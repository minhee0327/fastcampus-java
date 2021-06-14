package chapter06.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")){
            System.out.println("read");
        } catch (FileNotFoundException e) { //finally 가 없는 경우 처리
            e.printStackTrace();
        } catch (IOException e) {   //close 처리
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
