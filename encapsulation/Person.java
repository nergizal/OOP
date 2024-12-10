package encapsulation;

public class Person {
    public Person(String x,int y ){
        this.name=x;
        this.id=y;
        if(y>100){
            this.id=100;
        }
        else
            this.id=y;

    }
     private String name;
     private int id;

     public String getName(){
        return this.name;//for getting the value of an attributes
     }
     void setName(String newName){
        if (newName == "nergiiz"){
            this.name="George";
        }
        else
        this.name= newName;
     }

     public int getId(){ // get çıktılama görevi yapıypor just
        return this.id;
     }

     void setId(int newId){ // değeri çıktı olarak vermesine gerek olmadığı için void kullanıyoruz.
        if (newId>10){
            this.id=100;
        }else
        this.id=newId;
     }
     
}
