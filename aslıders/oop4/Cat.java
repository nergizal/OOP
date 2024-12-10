package oop4;


public class Cat {
    String catBreed ="Street.cat";
    int catNumber=43;
    private boolean adoptCat=false;

    public Cat(String breed, int number,boolean adopted){
        this.catBreed=breed;
        this.catNumber=number;
        this.adoptCat=adopted;
    }

    String hungryCat(){
        return "meow";
    }

    static String petTheCat(){
        return "mrr";
    }

    void isAdopted(){
        adoptCat=true;
        System.out.println("This cat is adopted"+ adoptCat);
    }
}
