package chapter05.ch08;

public class GenericMethod {
    public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2){
        // getX(), getY() 의 반환값이 Object라서 Number객체로 casting 한 후에 doubleValue() privitive type 으로 바꿈.
        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double up = ((Number) p1.getY()).doubleValue();
        double bottom = ((Number) p2.getY()).doubleValue();

        double weight = right - left;
        double height = bottom - up;

        return weight * height;
    }
    public static void main(String[] args) {
        Point<Integer , Double> p1 = new Point<>(0, 0.0);
        Point<Integer , Double> p2 = new Point<>(10, 10.0);

        System.out.println(makeRectangle(p1, p2));
    }
}
