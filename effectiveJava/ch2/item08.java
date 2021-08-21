import java.lang.ref.Cleaner;

public class item08 implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    public class State implements Runnable {
        int numJunkPiles;

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkPiles = 0;
        }
    }

    private final State state;

    private final Cleaner.Cleanable cleanable;

    public item08 ( int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() {
        cleanable.clean();
    }

    public static void main(String[] args) {
        try (item08 myRoom = new item08(7)) {
            System.out.println("안녕");
        }
    }
}
