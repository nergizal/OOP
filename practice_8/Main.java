package practice_8;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee(2, "Nergiz", "Alıci", 50000);
        employee1.raiseSalary(50);
        System.out.println(employee1.toString());

    }
}
