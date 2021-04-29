package chapter01.ch07;

public class DoubleTest {
    public static void main(String[] args) {
        //실수: 1.m * 2^-n
        //실수 기본 타입 double
        double dnum = 3.14; //8 byte
        float fnum = 3.14f;  //4 byte (down error! 반드시 F(f) 붙여줘야한다.)

        System.out.println(dnum);
        System.out.println(fnum);

    }
}
