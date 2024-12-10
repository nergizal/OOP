package accountManager;

public class Main {
    public static void main(String[] args) {
        Acccount acc1 =new Acccount();

        acc1.setAccountnumber(20);
        acc1.setAmount(28f);
        acc1.setEmail("nergizalici@gmail.com");
        acc1.setName("Hiiğ my name is nergiiz");

        System.out.println(acc1.getAccountnumber());
        System.out.println(acc1.getName());
        System.out.println(acc1.getAccountnumber());
    }
}
