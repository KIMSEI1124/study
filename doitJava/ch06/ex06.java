public class ex06 {
    String str;
    int num;
    boolean is;

    ex06() {
        this("str",1);
    }

    ex06(String str, int num) {
        this.str = str;
        this.num = num;
    }
        

    ex06(String str, int num, boolean is) {
        this.str = str;
        this.num = num;
        this.is = is;
    } 

    ex06 returnItSelf() {
        return this;
    }

    public static void main(String[] args) {
        ex06 ex = new ex06();
        System.out.println(ex.is);

        ex06 ex1 = ex.returnItSelf();   // this 값을 클래스 변수에 대입
        System.out.println(ex1);        // ex.returnItSelf()의 반환 값 출력
        System.out.println(ex);         // 참조 변수 출력
    }
}