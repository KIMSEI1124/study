import java.util.*;
import java.util.stream.*;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream(); // 스트림 생성
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println( );
        sList.stream().sorted().forEach(s -> System.out.println(s));    // 새로운 스트림 생성
    }
}
