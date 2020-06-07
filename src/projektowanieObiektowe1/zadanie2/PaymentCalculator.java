package projektowanieObiektowe1.zadanie2;

public class PaymentCalculator {

    private final static  double ZUS_PAYMENT =1000;

    public static double nettoYearPayment(Employee employee) {
        return employee.getPayment() * 12;
    }

    public static double bruttoYearPayment (Employee employee) {
        double nettoPayment = employee.getPayment();
        double bruttoTaxPayment = employee.getPayment() * 0.2;
        return  (nettoPayment + bruttoTaxPayment + ZUS_PAYMENT) * 12;
    }
}
