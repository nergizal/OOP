package week14_1;



abstract class Echostar{
    abstract void printInfo(); //no body part {} 
}

class Employee extends Echostar{
    String name="Nergiz";
    int age=20;
    double salary=10.000;
     void printInfo(){
        System.out.println("Bugün quiz olduk.");
     }
}

abstract class Subject{
    public Subject(){

    }
    abstract void syllabus();
    void learn(){
        System.out.println("learn what");
    }
    class IT extends Subject{
        void syllabus(){
        System.out.println("hello world");}
    }
    
    
}
public class Main {
    public static void main(String[] args) {
        Echostar obj1=new Employee(); //upcasting
        obj1.printInfo();
            // 1.abstract classes can be used for datatypes for subclasses.
            //2.abstract classes can have conscructors also.
            //3.we can not create an object from abstract class.
            //4.abstarct classes do not have to have abstarct method 
            //if a class has an abstarct method, class must be abstract.
            //5. abstract classes can have static method.
            //6. abstract classes can have final methods.
        
    }

    
}
