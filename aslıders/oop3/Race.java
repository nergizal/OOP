package oop3;

public class Race {
    public static void main(String[] args) {
        Cars raceCar =new Cars("Bugatti", 450,2022);
        System.out.println(raceCar.carBrand);
        System.out.println(raceCar.carSpeed);
        System.out.println(raceCar.carYear);

        System.out.println(raceCar.getFuelInfo()); //dynamic
        System.out.println(Cars.getDriverInfo()); //static
        raceCar.getVehicleInfo();//void

        raceCar.getCarSecurity();

    }
}
