package Ornek;

public class Circle {
    double r;
    double pi; // const double a=100; // final static double  pi=3.1456;
    static int counter=0;

    public Circle(double radius, double pi){
        this.r=radius;
        this.pi=pi;
        counter++;

    }

    public void getArea(){
         double area= r*r*pi;
         System.out.println(area);
    }
   
    public void counter(){
        counter++;
        System.out.println();
    }

    //acces modifiers
    }
