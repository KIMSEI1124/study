import java.util.Arrays;
import java.util.EmptyStackException;

public class item07 {
    public class Stack {
        private Object[] elements;
        private int size = 0;
        private static final int DEFAULT_INTTIAL_CAPACITY = 16;

        public Stack() {
            elements = new Object[DEFAULT_INTTIAL_CAPACITY];
        }

        public void push(Object e) {
            ensureCapactiy();
            elements[size++] = e;
        }

        public Object pop() {
            if (size == 0)
                throw new EmptyStackException();
                Object result = elements[--size];
                elements[size] = null;  // 다 쓴 참조 해체하여 메모리 누수를 막는다.
            return result;
        }

        private void ensureCapactiy() {
            if (elements.length == size) {
                elements = Arrays.copyOf(elements, 2 * size + 1);
            }
        }
    }

}
