public class Area{

int radius , height, width;
double area;

public Area(){

}


public String calculateArea(int radius){
area=2*3.14*radius;
return "area of circle is :"+area;
}

public String calculateArea(int height, int width){
area=height*width;
return  "area of rectangle is :"+area;
}

public String calculateArea(double height){
area=height*height;
return "area of square is :"+area;
}


public static void main(String[] args){
Area obj1=new Area();
System.out.println(obj1.calculateArea(2.3));

Area obj2=new Area();
System.out.println(obj1.calculateArea(2,3));
System.out.println(obj1.calculateArea(2));




}

}