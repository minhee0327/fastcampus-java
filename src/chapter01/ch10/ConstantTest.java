package chapter01.ch10;

public class ConstantTest {
    public static void main(String[] args) {
        // final: 상수 선언 (변수 뿐만 아니라 class, method 도 가능)
        // 통상 선언과 동시에 초기화 하는 편이고 대문자 사용.
        // 값을 지정하지 않고는 사용 불가능. 한번 저장하면 바꿀 수 없음.
        // 의미 있는 숫자 (가독성), 여러 부분 수정할 필요성이 줄어들 수 있음.

        final int MAX_NUM = 100;
        final int MiN_NUM;

        // MAX_NUM = 20;

        System.out.println(MAX_NUM);
        //System.out.println(MiN_NUM);

        MiN_NUM = 10;
        System.out.println(MAX_NUM);

        // compile time: 상수, static, constant pool(리터럴) [컴파일 타임에 메모리에 올라가지는 것들]

        // 형변환
        // 데이터 타입이 다르거나(크기가 다른경우), 표현방식의 차이(소수, 정수) 를 맞춰 줘야한다.

    }
}
