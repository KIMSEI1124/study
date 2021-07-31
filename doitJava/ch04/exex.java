public class exex {

    public static void main(String[] args) {
        int n1 = 10;
        int s1 = 0;
        //do-while문 do{}를 한번 실행하고 while문 조건확인후 실행
        do {
            s1 += n1;
            System.out.println(s1);
        }
        while ( s1 <= 30);
            

        // continue는 이후의 문장을 수행하지 않고 처음으로 돌아가서 실행한다.
        for ( int i = 0; 10>=i; i++) {
            if ( i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
