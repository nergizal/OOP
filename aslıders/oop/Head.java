package oop;

public class Head {
    public static void main(String[] args) {
        Persona objectFeature = new Persona(); //obje oluşturuyoruz. class field name

        objectFeature.name="Nergiz";
        objectFeature.age=20;
        objectFeature.isVillain=true;
        objectFeature.gender='F';

        System.out.println(objectFeature.name);
        System.out.println(objectFeature.age);
        System.out.println(objectFeature.isVillain);
        System.out.println(objectFeature.gender);

        objectFeature.wlfm();
        Persona.mhb(); //statik olduğu için class ismiyle çağırıyoruz
        objectFeature.colors("pink","blue"); //pink blue argüman oluyor
    }
    
}
