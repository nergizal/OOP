package week5;

import javax.annotation.processing.SupportedOptions;

public class First {
    public static void main(String[] args) {
        Second.x=25;
        Second objSec= new Second();
        objSec.message();

        Third objThird=new Third();
        objThird.message();
        
    }
}

class Second{
     static int x=10; //constant
     final String y="nergiz";

    void message(){
        System.out.println("Hiiğğğ");
    }
}
