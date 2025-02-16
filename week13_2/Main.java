package week13_2;

public class Main {
    public static void main(String[] args) {
        Circle obj1=new Circle();
        Rectangle obj2=new Rectangle();

        obj1.setColor("purple");
        obj1.setRadius(3);
        obj1.setFilled(true);
        

        obj2.setHeight(56.4);
        obj2.setWidth(4.55);
        System.out.println(obj2.getArea());
       
        }
}

abstract class GeometricObject {
        private String color;
        private boolean filled;


public String getColor(){
    return this.color;
}

public void setColor(String newColor){
    this.color=newColor;
}
public boolean isFilled(){
    return this.filled;
}
public void setFilled(Boolean newFilled ){
    this.filled=newFilled;
}
abstract double getArea();
abstract double getPerimeter();
public String toString(){
    return "Geometric object's,color: "+this.color+" is it filled?="+this.filled;
}}

class Circle extends GeometricObject{
    private double radius;
    
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getPerimeter(){
        return 2* Math.PI*radius;
    }
    public double getArea() {
        return Math.PI * radius * radius; // Alan formülü
    }
    
}

class Rectangle extends GeometricObject{
    private double height;
    private double width;

    public double getHeight(){
        return this.height;
    }
    public void setHeight(double newHeight){
        this.height=newHeight;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double newWidth){
        this.width=newWidth;
    }
    public double getArea(){
        return (width-height)/2;
    }
    public double getPerimeter(){
        return (2*width)+ (2*height);
    }

}
