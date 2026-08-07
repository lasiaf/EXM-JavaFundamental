package Interface;

public class PaymentService {

    private PaymentGateway gateway;
    private Poin thePoint;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
        this.thePoint = thePoint;
    }

    public PaymentService(PaymentGateway gateway, Poin thePoint) {
        this.gateway = gateway;
        this.thePoint = thePoint;
    }


    public void bayar() {
        gateway.transfer();
    }

    public void isiPoint() {
        thePoint.isiPoin();
    }

    public void klaimPoin() {
        thePoint.klaimPoin();
    }


}