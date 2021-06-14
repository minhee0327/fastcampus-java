package chapter06.ch01;

public class InnerTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.usingClass();
        System.out.println();

        //실무에선 잘 쓰이진 않지만, 이론적으로 가능한 것 (inner class 가 private 이라면 사용 불가)
        OuterClass.InClass inner = outerClass.new InClass();
        inner.inTest();
        System.out.println();

        //static inner class test
        OuterClass.InStaticClass inStaticClass = new OuterClass.InStaticClass();
        inStaticClass.inTest();
        OuterClass.InStaticClass.sTest(); //static class 의 static method 호출

    }
}

class OuterClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    OuterClass() {
        this.inClass = new InClass();
    }

    //instance inner class 는 outer class 가 생성된 후에 생성이 되야하기 때문에, static 멤버변수 사용 불가능.
    class InClass {
        int iNum = 100;

        //static int sInNum = 500;
        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");

        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    //정적 내부 클래스
    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            // 내부 클래스가 static 이라 instance 생성과 상관없이 그 전에 compile 되어있기 때문에 num은 불러올 수 없다.
//            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 정 변수)");

        }

        static void sTest() {
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
        }
    }
}