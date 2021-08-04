public class ex10 implements if1{
    public void test() {
        System.out.println("인터페이스");
    }

    public static void main(String[] args){
        ex10 ex = new ex10();
        ex.test();
    }
}

interface if1 {
    public void tset();
}
