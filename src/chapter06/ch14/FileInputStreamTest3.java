package chapter06.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {

        int i;
        try(FileInputStream fis = new FileInputStream("input2.txt")){
            byte[] bs = new byte[10];
//            while((i = fis.read(bs)) != -1){
//                //enhanced for 문을 사용하면 buffer에 남아있는 값까지 다 읽어들여서 일반 for 문 사용함.
//                for(int j=0 ; j < i; j++){
//                    System.out.print((char) bs[j]);
//                }
//               System.out.println(" : " + i + "바이트 읽음");
//            }
            while((i = fis.read(bs, 1, 9)) != -1){
                //enhanced for 문을 사용하면 buffer에 남아있는 값까지 다 읽어들여서 일반 for 문 사용함.
                for(int j=0 ; j < i; j++){
                    System.out.print((char) bs[j]);
                }
               System.out.println(" : " + i + "바이트 읽음");
            }
        }catch (IOException e){
            System.out.println(e);
        };
    }
}
