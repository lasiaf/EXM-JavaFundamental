package Interface;

public class QRIS implements PaymentGateway{
    public void transfer() {
        System.out.println("Transfer via QRIS");
    }
}
