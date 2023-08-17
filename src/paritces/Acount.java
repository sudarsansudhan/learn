package paritces;

public class Acount {
    String name;
    String accountnumber;
    double balanace;

    public Acount(String name, String accountnumber, double balanace) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.balanace = balanace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalanace() {
        return balanace;
    }

    public void setBalanace(double balanace) {
        this.balanace = balanace;
    }

    public void deposite(double amount){
        balanace+=amount;
    }
    public void withdraw(double amount){
        balanace-=amount;
    }
    public String getAcountInfo(){
        return "name :"+name +", Acount number "+accountnumber+", Banalance "+balanace;
    }


}
