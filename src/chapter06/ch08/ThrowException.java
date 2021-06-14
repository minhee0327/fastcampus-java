package chapter06.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        // throws 가 있는 method 를 호출할때 error 를 남긴다.
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
    //main 에 throws 하면, VM 이 관리를 하면서 abort 된다.
    public static void main(String[] args) {
        ThrowException te = new ThrowException();
        try {
            te.loadClass("a.txt", "java.lang.String");
        } catch (ClassNotFoundException | FileNotFoundException e){
            System.out.println(e);
        } catch (Exception e){
            //default exception은 가장 마지막에 사용할 것. (모든 exception 의 최상위이기 때문에 상단에 두면 다른 excption 을 찾지 못함)
            System.out.println(e);
        }

        System.out.println("end");
    }
}
