package encapsulation;

public class TestPerson {
    public static void main(String[] args) {
        Person objPer = new Person("ali",120);

        System.out.println(objPer);

        objPer.setName("alparsan");
        objPer.setId(120);

       /*  System.out.println(objPer.getName()); // this is a getter
        System.out.println(objPer.getId());*/
        System.out.println(objPer.getName());
        System.out.println(objPer.getId());
    }
}
