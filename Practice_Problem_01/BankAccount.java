package Practice_Problem_01;

public class BankAccount {
    int accountnumber,ballance;
    String accountholder,accounttype;

    public void setacc(String name,int number){
        this.accountholder=name;
        this.accountnumber=number;
    }
    public void withdrawaltype(String name){
        this.accounttype=name;

    }
    int deposit(int x){
        this.ballance+=x;
        System.out.println(this.accountholder+"  " +this.ballance);
        return ballance;
    }

    int withdraw(int x){
        if(ballance>=x) this.ballance-=x;
        else System.out.println( this.accountholder + "   Impossible : you have not enough money");
        return ballance;
    }

    int withdraw(int x,String name){
        if(ballance>=x) {
            this.ballance -= x;
            System.out.println(this.accountholder+ " "+ this.accounttype +" "+ this.ballance);
        }
        else System.out.println( this.accountholder+": "+ this.accounttype + "   Impossible : you have not enough money");
        return ballance;
    }

    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        BankAccount p2 = new BankAccount();

        p1.setacc("labib",5456656);
        p2.setacc("tuhin", 16268766);
        p1.withdrawaltype("ATM");
        p2.withdrawaltype("Online transfer");


        p1.deposit(25);
        p2.deposit(566);
        p1.deposit(1000);
        p2.deposit(54);
        p1.withdraw(102);
        p1.withdraw(1000,"ATM");
        p2.withdraw(2000);



    }
}
