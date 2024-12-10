package weekeleven1;

 class A{

    void functionA(){
        System.out.println("Function A");
    }
}

class B extends A{

    int x=20;
    void functionB(){
        System.out.println("Function B");
    }
}

class C extends B{

}

class X{

}

class Y{

}

public class Main {
    public static void main(String[] args) {
        C obj1= new C();
        B obj2=new B();
        obj1.functionA();
        obj1.functionB();

        obj2.functionA();
        obj2.functionB();

        
    }
}
//multiple inheritance:having more than one parents in child.