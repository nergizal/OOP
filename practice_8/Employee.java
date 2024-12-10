package practice_8;

public class Employee {
    private int id;
    private String FirstName;
    private String LastName;
    private int salary;
    

    public Employee(int id, String FirstName, String LastName, int salary){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.id=id;
        this.salary=salary;

    }
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public String getLastName(){
        return this.LastName;
    }

    public String getName(){

        return this.FirstName + " " + this.LastName;
    }

    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int newSalary){
        this.salary=newSalary;
    }

    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int raiseSalary(int percentage){
         return this.salary =this.salary + (percentage*this.salary)/100;
    }
    public String toString(){
        return " Id: " + this.getId()  + " First Name:" + this.getFirstName() + " Last Name:" + this.getLastName() + " Salary:" + this.getSalary() + " Annual Salary:" + this.getAnnualSalary();
    }

}
