package chapter01.ch09;

public class LocalVariableType {
    public static void main(String[] args) {
        // 지역변수 자료형 없이 변수 선언 및 사용하기
        // jdk v.10 이상 (+ 지역변수에 한해서만 사용 가능)

        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        System.out.println(str);

        // 기존에 string type 이었던것을 int 로 변경은 불가능 (타입 변경 불가)
        // str = 3;
    }
}
