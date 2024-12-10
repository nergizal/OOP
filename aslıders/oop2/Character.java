package oop2;

public class Character {
    String charName;
    int charAge;
    boolean charPersonality;
    static int counter=0;

    public Character(String name, int age, boolean isVillain){ //conscructor
        this.charName=name;                                     //conscructor
        this.charAge=age;                                        //conscructor
        this.charPersonality=isVillain;                          //conscructor
        counter++;                                               //conscructor
    }                                                              //conscructor

    void sayQuote(){ //methods
        System.out.println("Rules are made to be broken");
    }
    static String voiceLine(){ //methods
        return "I am not a good loser";
    }
}
