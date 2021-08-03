public class item03 {
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}

/* 
책에서 설명하는 싱글턴패턴중 가장 바람직한 방법은 열거형이다.
단, 만들려는 싱글턴이 Enum 외의 클래스를 상속해야 한다면 이방법은 사용할 수 없다.
*/
enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("RUN");
    }
}
