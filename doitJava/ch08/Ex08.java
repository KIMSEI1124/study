class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bounsPoint;
    double bounsRatio;

    public int getCustomerID() {
        return customerID;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bounsRatio = 0.01;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCuostomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGarde) {
        this.customerGrade = customerGarde;
    }


    public Customer() {
        customerGrade = "SILVER";
        bounsRatio = 0.01;
    } // 디폴트 생성자 생성

    public int calcPrice(int price) {
        bounsPoint += price * bounsRatio;
        return bounsPoint;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bounsPoint + "입니다." ; 
    }
}

class VIPCustomer extends Customer {
    private int agentID;
    double saleRaito;

    public VIPCustomer() {
        super();    // 상위 클래스의 Customer()가 호출된다.
        customerGrade = "VIP";
        bounsRatio = 0.05;
        saleRaito = 0.1;
    }
    
    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);    // 상위 클래스의 Customer()가 호출된다.
        customerGrade = "VIP";
        bounsRatio = 0.05;
        saleRaito = 0.1;
        this.agentID = agentID;
    }

    
    public int getAgentID() {
        return agentID;
    }
    
    @Override 
    public int calePrice(int price) {   // 재정의한 메서드
        // bounsPoint += price * bounsRatio;
        // return price - (int) (price * saleRaito);
        return super.calcPrice(price);
    }
}

public class Ex08{
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        customerLee.bounsPoint = 1000;
        
        VIPCustomer customerKim = new VIPCustomer(10020,"김유신",12345);
        customerKim.bounsPoint = 10000;

        System.out.println(customerKim.showCustomerInfo());
    }
}