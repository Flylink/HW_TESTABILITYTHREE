public class CreditPaymentService {
    public int calculate(int sum, double rate, int months) {
        double i = rate / 12 / 100; // процентная ставка в месяц
        double pow = Math.pow(1 + i, months); // (1 + i)^n
        double payment = sum * (i + i / (pow - 1)); // ежемесячный платеж
        return (int) payment;
    }
}