package oop2;

public class Master {
    public static void main(String[] args) {
        Character objectFeatures1=new Character("Nergiz",20, true);
        Character objectFeatures2=new Character("Aslı", 21,true);

        System.out.println(objectFeatures1.charName);
        System.out.println(objectFeatures1.charAge);
        System.out.println(objectFeatures1.charPersonality);
        objectFeatures2.sayQuote();

        System.out.println(objectFeatures2.charName);
        System.out.println(objectFeatures2.charAge);
        System.out.println(objectFeatures1.charPersonality);
        System.out.println(Character.voiceLine());

        System.out.println(("Number of characters:" + Character.counter));
        
        
        
        
        
        
    }
   
}
