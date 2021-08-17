import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt"); // a.txt라는 파일은 존재 하지 않는다.
        } catch (FileNotFoundException e) { // 파일이 존재하지 않으므로 예외처리가 된다.
            System.out.println(e);  
        }
        System.out.println("여기도 수행됩니다.");
    }
}