public class item04 {
    // private를 사용하여 인스턴스화를 막는다. (주석처리를 잘하자)
    private item04() {
        // AssertionError를 사용하여 클래스 안에서 실수로라도 생성자를 호출하지 않도록 한다.
        throw new AssertionError();
    }
}
