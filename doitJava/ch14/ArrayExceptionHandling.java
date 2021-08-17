public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 크기 5

        try {   // 예외가 발생할수도 있는 코드
            for ( int i = 0; i <= 5; i++) { // 배열의 크기보다 크게 저장한다.
                arr[i] = i; // i는 6일때 오류 발생
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e ) {    // 예외 처리 부분
            System.out.println(e);
            System.out.println("예외 처리 부분");
        }
        System.out.println("프로그램 종료");
    }
}
