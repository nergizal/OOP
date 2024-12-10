package weekten3;
class Circle{
   private double radius=1.0;
   private String color="red";

public Circle(){

}
public Circle(double radius){
    this.radius=radius;

}
public Circle(double radius, String color){
    this.color=color;
    this.radius=radius;
}

public double getRadius(){
    return this.radius;
}
public void setRadius(double newRadius){
    this.radius=newRadius;
}
public String getColor(){
    return this.color;
}
public void setColor(String newColor){
    this.color=newColor;
}
public double getArea(){
    return Math.PI*getRadius()*getRadius();
}
public String toString(){
    return "Area:" + getArea();
}
}

class Cylinder extends Circle{
    double height=1.0;

public Cylinder(){

}
public Cylinder(double radius){
    super(radius);

}
public Cylinder(double radius, double height ){
    super(radius);
    this.height=height;
}
public Cylinder(double radius, double height, String color){
    super(radius, color);
    this.height=height;

}

public Cylinder( double radius, String color, double height){
   super(radius, color);
}

public double getHeight(){
    return this.height;
}
public void setHeight(double newHeight){
    this.height=newHeight;
}
public double getVolume(){
    return Math.PI*getRadius()*getRadius()*getHeight();
}
}


public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}
