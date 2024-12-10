package Onur;

public class TestStudent {
    public static void main(String[] args) {
        
        Student student1 = new Student();//conscructor
        System.out.println(student1);
        student1.name="Nergiz";
        student1.age=20;
        student1.allowance=1000;
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.allowance);

        Student student2=new Student();
        System.out.println(student2);
        student2.name="Aslı";
        student2.age=20;
        student2.allowance=2000;

        Student student3=new Student();
        System.out.println(student3);
        student3.name="Bilge";
        student3.age=20;
        student3.allowance=3000;

        // Access a variable:read and write
        //statement expression farkı:Kısaca expressionlar değer döndüren kod satırları; statement ise bir şeyler gerçekleştiren kod satırlarıdır.
        // assign 5 to a  a=5;
        //upper camel case =pascal case diğer adı
        //Access modifiers: public, private, protected default, package private

        // 
    }
}