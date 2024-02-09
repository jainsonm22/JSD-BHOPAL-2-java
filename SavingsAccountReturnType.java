public class SavingsAccountReturnType {


int balance=0;
String username;
int count=0;

public SavingsAccountReturnType(int bal,String username1){
balance=bal;
username=username1;
}


public String deposit(int amount){

balance=amount+balance;
count++;
return "your balance after "+count+" deposit :"+balance;
}

public int widraw(int amount){
balance=balance-amount;
return balance;
}

public int totalBal()
{
int bal;
int interestRate=3;
int time=2;
bal=time*balance*interestRate;
return bal;
}

//public String printData(){

//System.out.println("Hello="+username+"!");
//System.out.println("Your balance is :"+balance);
//}

public String toString(){

return "Hello="+username+"! Your balance is :"+balance;
}

public static void main(String[] args){
  
   SavingsAccountReturnType user1=new SavingsAccountReturnType(50000,"abc");
   SavingsAccountReturnType user2=new SavingsAccountReturnType(10000,"xyz");

   System.out.println("object 1 :"+user1);
   System.out.println("object 2 :"+user2);

   System.out.println(user1.deposit(1000));
   System.out.println(user1.deposit(100));
   System.out.println("your final balance is "+user1.totalBal());
 
   user2.widraw(5000);
   user2.deposit(2000);
   user2.totalBal();
  // user2.printData();
  
   


   }
}
