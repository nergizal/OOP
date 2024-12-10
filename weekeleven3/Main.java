package weekeleven3;

class Person{
    private String name;
     private String address;

public Person(String name, String address){
    this.name=name;
    this.address=address;
}
public String getName(){
    return this.name;
}
public String getAddress(){
    return this.address;
}
public void setAddress(String newAddress){
    this.address=newAddress;
}
}

class Student extends Person{
    private String program;
    private int years;
    private double fee;

    public Student( String name, String address,String program, int years, double fee){
        super(name, address);
        this.program=program;
        this.years=years;
        this.fee=fee;
    }
    public String getProgram(){
        return this.program;
    }
    public void setProgram(String newProgram){
        this.program=newProgram;
    }
    public int getYear(){
        return this.years;
    }
    public void setYear(int newYears){
        this.years=newYears;
    }
    public double getFee(){
        return this.fee;
    }
    public void setFee(double newFee){
        this.fee=newFee;
    }
    public String toString(){
        return "Name:"+ super.getName() +"Address:" + super.getAddress() + "Program:" + getProgram() + "Years:" + getYear()+ "Fee:" + getFee();
    }
}

 class Staff extends Person{
    private String school;
    private double pay;
    public Staff( String name, String address,String school, int years, double pay){
       super(name,address);
        this.pay=pay;
        this.school=school;
    }
public String getSchool(){
    return this.school;
}

   
    
}

public class Main {
    public static void main(String[] args) {
        
    }
}
