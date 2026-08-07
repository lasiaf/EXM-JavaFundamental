package Interface;

public class Gopay implements PaymentGateway, Poin{
    public void transfer() {
        System.out.println("Transfer via Gopay");
    }

    public void isiPoin() {
        System.out.println("Mengisi Poin Gopay");
    }

    public void klaimPoin() {
        System.out.println("Klaim Poin Gopay");
    }
}
