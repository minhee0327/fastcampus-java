package chapter01.ch10;

public class TypeConversionTest {
    public static void main(String[] args) {

        int iNum = 255;
        byte bNum = (byte) iNum;

        System.out.println(bNum);
        System.out.println(iNum);

        double dNum = 3.14;
        int inum = (int) dNum; //명시적 형변환

        System.out.println(inum); // 자료 유실

        double dNum2 = 1.2;
        float fNum2 = 0.9F;

        int iNum1 = (int) dNum2 + (int) fNum2;  //1
        int iNum2 = (int) (dNum2 + fNum2);      //2

        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
