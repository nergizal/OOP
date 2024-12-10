package week12_3;

public class Polymorphism {
    
}

class Parent{
    void print(){
        System.out.println("hiğ my name is nergiz");
    }
}

class Subclass1 extends Parent{
    void print(){
        System.out.println("hiğğ my name is ponçiksss");
    }
}

class Subclass2 extends Parent{
    void print(){
        System.out.println("hiğğ my name is chatgpt");
    }
}

class Main{
    public static void main(String[] args) {
        Parent parent=new Parent();
        Subclass1 person1=new Subclass1();
        Subclass2 person2=new Subclass2();
        parent.print();
        person1.print();
        person2.print();

        Grandfather gf=new Grandfather();
        Father father=new Father();
        Son son =new Son();
        gf.swim();
        father.swim();
        son.swim();
        
    }
}

class Grandfather{
    void swim(){
        System.out.println("swimming..");
    }
}

class Father extends Grandfather{
    void swim(){
        System.out.println("he is swimming");
    }
}
class Son extends Father{
    void swim(){
        System.out.println("I love swim");
    }
}