package chapter04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("chapter04.ch04.Person");

        Person person = (Person) c1.newInstance();
        person.setName("Lee");
        System.out.println(person);

        // reflection programming: local 에 Person 이 없을 때 사용하는 방법
        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println(p);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kim = (Person) cons.newInstance(initargs);
        System.out.println(kim);

        Person kim2 = new Person("Kim");

    }
}
