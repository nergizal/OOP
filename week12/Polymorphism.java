package week12;

public class Polymorphism {
    // Polymorphism:Multiple forms. 
    //-There should be Inheritance
    //-Two types of Polymorphism: 1)Compile time(overloading) 2)Run Time(Overriding)
    // myFunc(int x, int y) , myFunc(int a , int b) there are same
    //myFunc(int x, int y) , myFunc(int a , double) there are different. we call them signitura of the metods
    

}

class Helper{
    int multiply(int a, int b){
        return a*b;
    }

    double multiply(double a, double b){
        return a*b;
    }
    double multiply(double a, double b, double c){
        return a*b*c;
    }

    
}

class Main{
    public static void main(String[] args) {
        Helper obj=new Helper();
        Shape shape=new Shape();

        System.out.println(obj.multiply(2,3));
        System.out.println(obj.multiply(2.8,3.5,4.5));
        System.out.println(obj.multiply(5,1.7,4.8));

        System.out.println(shape.area(5));
        System.out.println(shape.area(6.2,8));
        System.out.println(shape.area(9,5));
      
        
      
        
    }
}

class Shape{
    double area(int r){ //circle
        return Math.PI *(r*r);
    }
    int area(int a , int b){//rectangle
        return a*b;
    }
    double area(double c, double h){// triangle
        return (c*h)/2;
    }
}
// Type casting is changing variable temporarily. int a = (double) c;
// up casting Chil c = new Child();  c.m1, c.m2, c.m3, c.m4
//Parent p = new Child();
