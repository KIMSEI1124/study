import java.util.*;

public class Ex12<T> {  // 제네릭 클래스 사용 다이아몬드 연산자안에 <> 값 T(타입),K(키),E(원소) ...
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.get(0);
    }
}
