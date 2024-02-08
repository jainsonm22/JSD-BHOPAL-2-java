public class SavingsAccountWidDeposit {


int balance;
String username;

public SavingsAccountWidDeposit(int bal,String username1){
balance=bal;
username=username1;
}

public void deposit(int amount){
balance=balance+amount;
}

public void widraw(int amount){
balance=balance-amount;
}

public void totalBal()
{
int interestRate=3;
int time=2;
balance=time*balance*interestRate;
}

public void printData(){

System.out.println("Hello="+username+"!");
System.out.println("Your balance is :"+balance);
}

public static void main(String[] args){
  
   SavingsAccountWidDeposit user1=new SavingsAccountWidDeposit(50000,"abc");

   SavingsAccountWidDeposit user2=new SavingsAccountWidDeposit(10000,"xyz");
   
   user1.deposit(1000);
   user1.deposit(100);
  // user1.totalBal();
  // user1.printData();


   user2.widraw(5000);
   user2.deposit(2000);
   user2.totalBal();
   user2.printData();
  
   


   }
}
