public class ConsDemo{

String name;
int age;

public ConsDemo(){
System.out.println("from defeault constructor");
}


public ConsDemo(String name1 ,int age1)
{
name=name1;
age=age1;
System.out.println("name of student="+name1);
System.out.println("name of age="+age1+"\n");
}

public ConsDemo(int  age1 ,String name1)
{
name=name1;
age=age1;
System.out.println("name of student="+name1);
System.out.println("name of age="+age1+"\n");
}

public ConsDemo(String name1 ,int age1,String address)
{
name=name1;
age=age1;
System.out.println("name of student="+name1);
System.out.println("age of user="+age1);
System.out.println("address of user="+address+"\n");

}
public ConsDemo(int year,int age1)
{

age=age1;
System.out.println("Year of student="+year);
System.out.println("name of age="+age1+"\n");
}

public static void main(String[] args){

  ConsDemo obj1= new  ConsDemo("user1",30 ,"indore");

  ConsDemo obj2= new ConsDemo("user1",30);

  ConsDemo obj4= new ConsDemo(30, "user1");

  ConsDemo obj5= new ConsDemo(2024, 30);

  ConsDemo obj3= new ConsDemo();

}
}