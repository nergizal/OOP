package accountManager;

public class Acccount {
    private int accountnumber;
    private String name;
    private String email;
    private float amount;

    public int getAccountnumber(){
        return this.accountnumber;
    }

    public void setAccountnumber(int newID){
        this.accountnumber=newID;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setEmail( String newEmail){
        this.email=newEmail;
    }
    public float getAmount(){
        return this.amount;
    }
    public void setAmount(Float newAmount){
        this.amount=newAmount;
    }
}
