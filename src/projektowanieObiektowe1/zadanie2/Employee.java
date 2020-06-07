package projektowanieObiektowe1.zadanie2;

public class Employee {
   private String name;
    private String surname;
    private double payment;

    public Employee(String name, String surname, int payment) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
