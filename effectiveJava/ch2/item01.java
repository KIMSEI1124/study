import java.util.EnumSet;

public class item01 {
    String name;
    int num;
    public item01() {
    }

    /*
    2)
    ex) 삼항연산자
    인스턴스를 미리 만들어 놓거나, 파싱해와서 사용한다.
    */
    private static final item01 DayOne = new item01();

    public item01 (String name) {
        this.name = name;
    }

    /*
    1)
    한 클래스에 시그니처가 같은 생성자가 여러 개 필요할 것 같으면, 
    생성자를 정적 팩터리 메서드로 바꾸고 각각의 차이를 잘 드러나는 이름으로 지어준다.
    */
    public static item01 withName(String name){
        return new item01(name);
    }

    public static item01 withNum(int num) {
        item01 item = new item01();
        item.num = num;
        return item;
    }

    /*
    4)
    입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
    */
    public static item01 getItme(boolean is) {   // 예) is가 Ture이면 item01()을 반환, false이면 newitem01을 반환
        return is ? new item01() : new newitem01();
    }

    static class newitem01 extends item01 {

    }
    
    enum color {
        RED, BLUE, WHITH
    }

    public static void main(String[] args) {
        item01 i1 = new item01();
        item01 i2 = item01.withName("name");  // 1)
        item01 i3 = item01.withNum(1);        // 1)
        item01 i4 = item01.DayOne;            // 2)
        EnumSet<color> color1 = EnumSet.allOf(color.class); // 4) 원소의 개수에 따라 반환하는 인스턴스가 다르다.
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(color1);
    }
}