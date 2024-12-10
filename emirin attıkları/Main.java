package testOnur;

import java.util.ArrayList; //bu importlar önemli sakın unutma
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Onur driver1 = new Onur("Behiç", 20,10,false);
        Onur driver2 = new Onur("Emir", 20,9,false);
        Onur driver3 = new Onur("Onur", 37, 4, false);
        Onur driver4 = new Onur("Jack Rourke", 32, 17, false);
        //4 tane sürücü adında obje oluşturdum objelerin özelliklerini "Onur.java" classımda atadım

        Scanner scan = new Scanner(System.in);
        ArrayList<Onur> racer = new ArrayList<>();
        //listemi açıyorum bunları sıralamak ya da başka işlemler yapmak için
        racer.addAll(Arrays.asList(driver1,driver2,driver3,driver4));
        //listeme 4 tane driver'ımı da atıyorum

        System.out.println();
        System.out.println("Your Money: "+Onur.money); // buradaki Onur.money önemli çünkü money diye bir değişkeni "Onur.java" classımdan
                                                       // atadım ve o değeri "Onur.money" kodunu yazarak diğer classtan değişkenimi çektim
        for(int i=0; i<racer.size(); i++)
        {
            System.out.println("("+(i+1)+")"+" "+racer.get(i).name);
        }
        //Listemi sıralamak için for kullandım
        
        driver1.Drive(); // driver 1 (yani behiç)'i diğer classta yazdığım fonksiyona yolluyor
       
    }
}
