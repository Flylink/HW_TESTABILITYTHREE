public class CreditPaymentService {
    public int calculate(int sum, double rate, int months) {
        double interestRate = rate / 12 / 100; // процентная ставка в месяц
        double monthlyСalculation = Math.pow(1 + interestRate, months); // (1 + i)^n
        double payment = sum * (interestRate + interestRate / (monthlyСalculation - 1)); // ежемесячный платеж
        return (int) payment;
    }
}