package practice_7;

public class Rectangle {
     private float length=1.0f;
     private float width=1.0f;

     public Rectangle(){

     }

     public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
     }

     public float getLength(){
        return this.length;
     }

     public void setLEngth(float newLength){
        this.length=newLength;
     }

     public float getWidth(){
        return this.width;
     }

     public void setWidth(float newWidth){
        this.width=newWidth;
     }

     public double getArea(){
        return 2*this.length+2*this.width;
     }

     public double getPerimeter(){
        return 2*this.length+2*this.width;
     }
     public String toString(){
        return "Area: " +this.getArea() + "Perimeter:" + this.getPerimeter();
     }
}
