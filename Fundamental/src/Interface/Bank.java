package Interface;

public class Bank implements PaymentGateway{
    public void transfer() {
        System.out.println("Transfer via Bank");
    }
}
