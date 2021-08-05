public class Ex11 implements Cloneable { // 객체를 복사해도 된다는 의미의 Cloneable 인터페이스 사용
    String str;

    Ex11(String str) {
        this.str = str;
    }

    @Override
    public String toString() { // toString 메서드 재정의
        return str + " toString 재정의";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Ex11 ex = new Ex11("test");
        System.out.println(ex.toString());

        Ex11 ex1 = new Ex11("test");
        /*
         * 인스턴스 주소값이 다르기때문에 false이다. 값이 동일한 경우 equals로 true를 할려면 equals를 Override한다.
         */
        System.out.println(ex.equals(ex1));

        // Ex11 cloneEx = (Ex11)ex1.clone(); ( 코드 수정해서 오류 고쳐보기 )

        String strTest1 = new String("test");
        String strTest2 = new String("test");
        System.out.println(strTest1 == strTest2);   // 인스턴스의 주소가 다름
        System.out.println(strTest1.equals(strTest2));  // 값은 동일

        String strTest3 = "hello";
        String strTest4 = "hello";
        System.out.println(strTest3 == strTest4);   // 상수 풀에 저장되어 있으므로 주소 값은 같음
        System.out.println(strTest3.equals(strTest4));  // 값은 동일
    }
}
