public class ex {
    public static void main(String[] args) {
        int value1 = 10;

        int num1 = ++value1;    // 증가하고 대입
        System.out.println(num1+ " " +value1);
        int num2 = value1++;    // 대입하고 증가
        System.out.println(num2+ " " +value1);

        /*
        &&  And 연산자
        ||  Or 연산자
        !   Not 연산자
        */
        
        // 비트연산자
        num1 >>= 1; // 정수만큼 >>쪽으로 비트를 이동
        System.out.println(num1);
        num1 <<= 1; // 정수만큼 <<쪽으로 비트를 이동
        System.out.println(num1);
        num1 >>>= 2; // 정수만큼 >>쪽으로 비트를 이동 비어진곳은 무조건 0으로
        System.out.println(num1);
        
        /*
        & 비트가 동일하면 1
        | 하나라도 동일하면 1
        ^ 둘이 같아야 1
        ~ 비트가 0이면 1, 1이면 0
        */

        // 삼항연산자
        boolean is = (num1 > num2) ? true : false;  // 조건식 ? 참 : 거짓
        System.out.println(is);
        
    }
}
