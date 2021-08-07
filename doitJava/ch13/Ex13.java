import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex13 {
    public void makeString(String s1, String s2) {
        System.out.println(s1 + "," + s2);
    }
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s1 = "Hello";
        String s2 = "World";
        // 스트림 생성. 중간 연산                   . 최종 연산
        list.stream().filter(s -> s.length() >= 5 ).forEach(s -> System.out.println(s));
        //list.stream().map( s -> s.getName() ).forEach(s -> System.out.println(s));
        
    }
}
