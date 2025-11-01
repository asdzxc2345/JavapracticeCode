class BankAccount {
    private int balance = 1000;

    public synchronized void Withdrawal(int amount){
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + "Widrawing $" + amount);

            try{
                Thread.sleep(500);

            }catch(InterruptException e){
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(Thread.currentThread.getName() + "Withdrawal completed , Remaining balance: $" + balance);
        }
        else{
            System.out.println(Thread.currentThread.getName()+ " Try to withdraw , Insufficient balance : $"+amount);
        }
    }
}

class Withdrawthread extends Thread{
    private BankAccount account ;
    private int amount ;

    public Withdrawthread(BankAccount account, int amount, String name){
        super(name);
        this.account=account;
        this.amount=amount;

    }
    @Override
    public void run(){
        account.Withdrawal(amount);
    }
}

public class BankDemo{
    public static void main(String [] args){
        BankAccount account = new BankAccount();

        Withdrawthread t1= new Withdrawthread(account, 700, "U1");
        Withdrawthread t2= new Withdrawthread(account, 7878, "U2");

        t1.start();
        t2.start();
    }
}