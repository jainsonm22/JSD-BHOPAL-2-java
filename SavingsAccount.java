public class SavingsAccount {

int balance;

public SavingsAccount(int initialBalance){
balance=initialBalance;
}

  public static void main(String[] args){
  
   SavingsAccount sa=new SavingsAccount(2000);
   System.out.println("Hello User!");
   System.out.println("initial balance is :"+sa.balance);

    int widraw= sa.balance-500;
    sa.balance=widraw;
    System.out.println("After widraw balance is :"+sa.balance);


    int deposit= sa.balance+1500;
    sa.balance=deposit;
    System.out.println("After deposit balance is :"+sa.balance);

  }
}
