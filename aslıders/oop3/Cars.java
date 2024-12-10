package oop3;

public class Cars {
    String carBrand;
    int carSpeed;
    double carYear;
    private boolean carSecurity= false;

    public Cars(String brand, int speed, double year){
        this.carBrand=brand;
        this.carSpeed=speed;
        this.carYear=year;
    }

    void getVehicleInfo(){
        System.out.println("This car is healthy");
    }

    static String getDriverInfo(){
        return "This car has driver";
    }

    String getFuelInfo(){
        return "Tank is full";
    }

    void getCarSecurity(){
        carSecurity=true;
        System.out.println("Car security is" + carSecurity);
    }

    
}
