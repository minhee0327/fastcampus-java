package chapter04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        //reflection programming [local 에 없는 remote 에 있는 걸 가져올 때]
        Constructor[] cons = c.getConstructors();

        for (Constructor co: cons){
            System.out.println(co);
        }

        Method[] m = c.getMethods();
        for(Method mth: m){
            System.out.println(mth);
        }
    }
}
