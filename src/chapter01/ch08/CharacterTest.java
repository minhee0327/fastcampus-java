package chapter01.ch08;

public class CharacterTest {
    public static void main(String[] args) {
        //ASKII: 1byte (8bit , 256)
        //다른 나라들 늘어남에 따라 나라별로 문자 세트 생김: euc-kr, ...
        //호환 문제 발생 : 모든 나라의 문자를 하나로 호환하자 => unicode (utf)
            // 1 byte 만 사용하는 경우는 완벽히 ASKII랑 호환 가능.
            // java: utf-8(1~4byte) 보다 utf-16(2byte)
            // utf-8은 유동적인 크기이기 때문에 네트워크 통신이나 입출력에 ASKII 등이 오면 오버헤드 발생

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); //type casting

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char) ch2);

        char han = '한';
        char ch = '\uD55C'; //unicode (16bit)

        System.out.println(han);
        System.out.println(ch);
    }
}
