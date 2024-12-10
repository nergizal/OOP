package circleOnur;

public class BomboOnur {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); 
        Circle circle2 = new Circle(3.1);
        Circle circle3 = new Circle(9, "Pink");

        //yan tarafta 3 Constructor yaptığım için istediğim objeye istediğim değeri atayabiliyorum
        //daireme istersem renk vermeyebilirim
        //istersem direk default yarıçapı verebilirim (yan tarafta yazdığım 1.5 değeri)

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
        
    }
}
