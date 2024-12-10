package circleOnur;

public class Circle {
    double radius = 1.5; //Constructor içine kendim değer girmezsem sistem otomatikmen bunu çekicek yarıçap diye.
    String color;
    
    Circle() //Constructor 1
    {

    }
    Circle(double radius) //override //Constructor 2
    {
        this.radius = radius;
    }
    Circle(double radius, String color) //override //Constructor 3
    {
        this.radius = radius;
        this.color = color;
    }
    double getArea() //Dairemin areasını bulma fonksiyonum
    {
        return this.radius * this.radius * Math.PI;
    }
    double getRadius() //Direk yarıçapı veren fonksiyon
    {
        return this.radius;
    }
    public String toString() //override //Daha düzenli gösterim için düzenleme
    {
        return "Circle [radius = "+radius+"  color = "+color+" ]";
    }

}
