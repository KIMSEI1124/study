public class ex {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1 + " " + (int) ch1);

        char ch2 = 66;
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3 + " " + (char) ch3);

        // 한글
        char ch4 = '한';
        char ch5 = '\uD55C';
        System.out.println(ch4 + " " + ch5);

        // var로 변수선언
        var intNum = 10;
        var doubleNum = 10.0;
        var str = "문자열";
        System.out.println(intNum + " " + doubleNum + " " + str);

        // final 선언
        final int max_num = 100;
        final int min_num = 1;
        System.out.println(max_num + " " + min_num);

        // 묵시적 형변환 - 바이트 크기가 작은것에서 큰것으로 변환 할때
        byte b1 = 1;
        short s1 = 10;
        int i1 = b1 + s1;
        System.out.println(i1);
        
        // 명시적 형변환 - 바이크 크기가 큰것에서 작은것으로 변환 할때
        int i2 = 10;
        double d2 = (double) i2;
        System.out.println(d2);

    }
}
