public class CreditPaymentService {
    public int calculate(int rublesSum, double percent, double monthsTerm) {
        double monthPay = rublesSum * (percent * (Math.pow(1 + percent, monthsTerm)) / ((Math.pow(1 + percent, monthsTerm)) - 1));
        return (int) monthPay;
    }
}
