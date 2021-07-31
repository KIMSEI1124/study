import java.util.EnumSet;

public class item01 {
    String name;
    int num;
    public item1() {
    }

    /*
    2)
    ex) 삼항연산자
    인스턴스를 미리 만들어 놓거나, 파싱해와서 사용한다.
    */
    private static final item1 DayOne = new item1();

    public item1 (String name) {
        this.name = name;
    }

    /*
    1)
    한 클래스에 시그니처가 같은 생성자가 여러 개 필요할 것 같으면, 
    생성자를 정적 팩터리 메서드로 바꾸고 각각의 차이를 잘 드러나는 이름으로 지어준다.
    */
    public static item1 withName(String name){
        return new item1(name);
    }

    public static item1 withNum(int num) {
        item1 item = new item1();
        item.num = num;
        return item;
    }

    /*
    4)
    입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
    */
    public static item1 getItme(boolean is) {   // 예) is가 Ture이면 item1()을 반환, false이면 newItem1을 반환
        return is ? new item1() : new newItem1();
    }

    static class newItem1 extends item1 {

    }
    
    enum color {
        RED, BLUE, WHITH
    }

    public static void main(String[] args) {
        item1 i1 = new item1();
        item1 i2 = item1.withName("name");  // 1)
        item1 i3 = item1.withNum(1);        // 1)
        item1 i4 = item1.DayOne;            // 2)
        EnumSet<color> color1 = EnumSet.allOf(color.class); // 4) 원소의 개수에 따라 반환하는 인스턴스가 다르다.
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(color1);
    }
}