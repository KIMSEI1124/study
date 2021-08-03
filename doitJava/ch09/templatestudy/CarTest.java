// 패키지 문제.. 나중에 수정해보기
public class CarTest {
    public static void main(String[] args) {
        System.out.println("===자율 주행하는 자동차 ===");
        Car myCar = new AICar();
        myCar.run();

        System.out.println("===사람이 운전하는 자동차 ===");
        Car hisCar = new ManualCar();
        hisCar.run();
    }

}