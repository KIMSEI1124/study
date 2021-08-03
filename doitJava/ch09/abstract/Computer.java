public abstract class Computer {
    abstract public void display();
    abstract public void typing();

    public void turnOn() {
        System.out.println("전원을 킵니다.");
    }
    
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
    
}
