public class ex05 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 학생 생성
        s1.setStudentName("이름");
        System.out.println(s1.getStudentName());

        // 메모리에 저장된 주소값 출력 : HashCode
        System.out.println(s1);
    }
}

class Student {
    private String name;

    // Sub형을 사용하여 선언
    Sub korean;
    Sub math;

    // private 변수인 name에 접근해 값을 가져오는 getter()
    public String getStudentName() {
        return name;
    }

    // private 변수인 name에 접근해 값을 저장하는 setter()
    public void setStudentName(String name) {
        this.name = name;
    }

}

class Sub {
    String str1;
    int num1;
}