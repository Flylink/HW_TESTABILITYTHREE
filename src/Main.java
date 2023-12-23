public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000; // сумма кредита
        double rate = 9.99; // годовая процентная ставка
        int months = 12; // количество месяцев
        int payment = service.calculate(sum, rate, months);
        System.out.println(payment); // должно получиться 87911

        sum = 1_000_000;
        rate = 9.99;
        months = 24;
        payment = service.calculate(sum, rate, months);
        System.out.println(payment); // должно получиться 46140

        sum = 1_000_000;
        rate = 9.99;
        months = 36;
        payment = service.calculate(sum, rate, months);
        System.out.println(payment); // должно получиться 32262
    }
}