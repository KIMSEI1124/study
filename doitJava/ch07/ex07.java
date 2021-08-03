public class ex07 {
    private String str;
    private int i;

    public ex07() {
    } // 디폴트 생성자

    public ex07(String str, int i) {
        this.str = str;
        this.i = i;
    }

    public String getStr() {
        return str;

    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 1, 2, 3, 4, 5 };

        // 복사할 배열, 복사할 첫 위치, 대상 배열, 붙여 넣을 첫 위치, 복사할 요소 개수
        System.arraycopy(arr1, 0, arr2, 1, 4);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        ex07[] ex1 = new ex07[3];
        ex07[] ex2 = new ex07[3];
        ex07[] ex3 = new ex07[3];
        ex1[0] = new ex07("a", 1);
        ex1[1] = new ex07("b", 2);
        ex1[2] = new ex07("c", 3);

        System.arraycopy(ex1, 0, ex2, 0, 2); // 얕은 복사

        for (int i = 0; ex1.length > i; i++) { // 깊은 복사
            ex3[i].setStr(ex1[i].getStr());
            ex3[i].setI(ex1[i].getI());
        }
    }
}
