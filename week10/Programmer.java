package week10;

class Employee {
    float salary=2.5f;
}


public class Programmer extends Employee {
    int bonus=500;
    public static void main(String[] args) {
        Programmer nergix=new Programmer();
        nergix.salary=15f;
        nergix.bonus=700;
        

        
    }
}
