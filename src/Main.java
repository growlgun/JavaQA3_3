public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int rublesSum = 1_000_000;
        double percent = 9.99 / (100 * 12);
        System.out.println(service.calculate(rublesSum, percent, 12));
        System.out.println();
        System.out.println(service.calculate(rublesSum, percent, 24));
        System.out.println();
        System.out.println(service.calculate(rublesSum, percent, 36));
        System.out.println();


    }
}