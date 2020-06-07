package projektowanieObiektowe1.zadanie2;

public class PaymentCalculator {

    public void nettoYearPayment(Employee employee) {
        double nettoYearPayment = employee.getPayment() * 12;
    }

    public void bruttoYearPayment (Employee employee) {
        double bruttoYearPayment = nettoYearPayment(employee) + employee.getPayment()*0.2*12 + 12000;
    }
}
