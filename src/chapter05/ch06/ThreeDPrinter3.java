package chapter05.ch06;

public class ThreeDPrinter3 {
    private Object material;

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "재료는 Powder 입니다.";
    }
}
