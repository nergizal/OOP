package oop;

public class Persona {
    String name;
    int age;
    boolean isVillain;
    char gender; // name, age, isVillain, gender bunlar bizim attributelarımız.

    public void wlfm(){
        System.out.println("Would you live for me ?");
    }

    public static void mhb(){
        System.out.println("My heart beat");
    }

    public void colors(String color1, String color2){ //string color 1,2 parametre oluyor- pink blue argüman
        System.out.println(color1 +  "&" + color2);
    }
}
