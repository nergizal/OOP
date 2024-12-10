package inheritance;


class Vehicle {
    String brand;

    public void honk(){
        System.out.println("oooooooooooo");
    }
    
}

public class CAr extends Vehicle{
    public static void main(String[] args) {
        CAr objCar= new CAr();

        objCar.brand="Ford";
        System.out.println("Brand of the car is" + objCar.brand);
        objCar.honk();
    }
}
