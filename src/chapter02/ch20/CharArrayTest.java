package chapter02.ch20;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        char ch = 'A';

        for(int i = 0; i < alpha.length; i++){
            alpha[i] = ch++;
        }

        for(char c: alpha){
            System.out.println(c +" , " + (int) c);
        }
    }
}
