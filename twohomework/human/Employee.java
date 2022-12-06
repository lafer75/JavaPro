package twohomework.human;

public class Employee {

    public String PIB;
    public String position;
    public String email;
    public int number;
    public int years;


    public Employee(String PIB, String position, String email, int number, int years) {
        this.setValues(PIB, position, email, number, years);
        System.out.println(this.getValues());
    }

    public void setValues(String PIB, String position, String email, int number, int years) {
        this.PIB = PIB;
        this.position = position;
        this.email = email;
        this.number = number;
        this.years = years;
    }

    public String getValues() {
        String info = "Фамілія, Ім'я, Пбатькові: \n" + this.PIB + "\n посада: \n" + this.position + "\n емейл: \n" + this.email + "\n телефон: \n" + this.number + "\n років: \n" + this.years;
        return info;
    }
}