package oop5;

public class NewWorld {
    public static void main(String[] args) {
        People human1=new People();
        System.out.println(human1.humanNumber + "" + human1.isAdoptedCat);

        People human2 =new People(false);

        System.out.println(human2.isAdoptedCat);
    }
}
