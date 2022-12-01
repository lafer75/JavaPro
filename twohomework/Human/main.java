package twohomework.Human;

public class main extends Employee{
    public static void main(String[] args) {
        Employee a = new Employee();
        base(a);
    }
    static void base(Employee Employee){
        Employee.PIB();
        Employee.email();
        Employee.position();
        Employee.years();
    }
}
