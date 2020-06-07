package projektowanieObiektowe1.zadanie2;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Karol", "Kowalski", 3000);
        Employee employee2 = new Employee("Janusz", "Zeromski", 9000);

        double nettoYearPayment = PaymentCalculator.nettoYearPayment(employee1);
        double bruttoYearPayment = PaymentCalculator.bruttoYearPayment(employee1);

        double nettoYearPayment1 = PaymentCalculator.nettoYearPayment(employee2);
        double bruttoYearPayment1 = PaymentCalculator.bruttoYearPayment(employee2);

        System.out.println("Roczna wyplata netto to: " + nettoYearPayment);
        System.out.println("Roczna wyplata brutto to: " + bruttoYearPayment);


        System.out.println("Roczna wyplata netto to: " + nettoYearPayment1);
        System.out.println("Roczna wyplata brutto to: " + bruttoYearPayment1);

    }
}
