package testOnur;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;

//yukardakiler import kısımları, buraya değil de "Main.java" kısmında ArrayList'i import etmen gerek ona dikkat et!
public class Onur {
    String name;
    int age;
    int skillPoint;
    Boolean isMal;
    //Objelerimin sahip olmasını istediğim özellikleri tanımlamaya yukardan başladım
    static int behiç_counter; 
    static int money=50;
    // static yapısı burda çok önemli, eğer diğer "Main.java" class'ımda bunları kullanmak istiyorsam static yazmam gerek
    // static yazmak, diğer class'ların değeri burdan çekmesini sağlar

    Onur(String name,int age,int skillPoint,Boolean isMal)// bu bir conductor
    {
        this.name = name;
        this.age = age;
        this.skillPoint = skillPoint;
        this.isMal = isMal;
    }
    //en yukarda yazdığım değerleri aynı şekilde conductorumun içine yazdım, conductorun süs parantezlerin içerisine de aynı şekilde yazıoyrum
    //this kullanarak
    
    
    void Drive() // Fonksiyonum, hangi şoförümün sürmesini istiyorsam onu yazıyor (bu değeri main classımdan başlatıyorum)
    {
        System.out.println(this.name+" is driving");
    }




    /*void SundayDrive(ArrayList<Onur> racer)  //Bu fonksiyon biraz şov bunu çok dikkate almana gerek yok (ztn çok bi olayı da yok)
    {
        System.out.println(this.name+" is driving");
        Time(5000);
        Random rand = new Random();
        int index = rand.nextInt(21) + rand.nextInt(this.skillPoint);
        if(this.age <= 20){
        
            index++;
        }
        else if(this.age > 20 && this.age <=30){

            index+=2;
        }
        else{
            
            index+=3;
        }

        if(index > 13)
        {
            System.out.println(this.name+" completed Sunday Drive succesfully");
            Time(1000);
            System.out.println("You earned 50 money!");
            Time(1000);
            money+=50;
            System.out.println("Your current money: "+money);
            System.out.println();
            Main.main(null);
        }
        else{
            int crash = rand.nextInt(8);
            switch(crash)
            {
                case 1: System.out.println(this.name+" dağdan aşağı uçtu (Crashed)"); break;
                case 2: System.out.println(this.name+" karşıdan gelen trafik aracına çarptı (Crashed)"); break;
                case 3: System.out.println(this.name+" Duran Tıra çarptı (Crashed)"); break;
                case 4: System.out.println(this.name+" 42St İBB Otobüsü ile kafa kafaya girdi (Crashed)"); break;
                case 5: System.out.println(this.name+" Vitesi yanlışıkla 3'e alcam derken 5 alıp ebesinin nikahını gördü (Crashed)"); break;
                case 6: System.out.println(this.name+" Serbest Muasebeci Faruk Beyin ofisine girdi (Crashed)"); break;
                case 7: System.out.println(this.name+" Drift atarken ağaca çarptı (Crashed)");
            }
            Time(1000);
            System.out.println("You lost 50 money!");
            Time(1000);
            money-=50;
            System.out.println("Your current money: "+money);
            System.out.println();
            Main.main(null);
        }
        
    }
        */
    static void Time(int time) // Buna da bakma
    {
      try{
        // Pause execution for 2 seconds (2000 milliseconds)
        Thread.sleep(time);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
    }
    /*Boolean Chance(int chance)
    {
        Random rand = new Random();
        int index = rand.nextInt(101); // 1 ile 100 arası random değer

        return index<=chance;
    }
        */
}
