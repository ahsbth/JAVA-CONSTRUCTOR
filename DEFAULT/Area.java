
import java.util.*;
  class Rectangle
  {
	  
	  float l,b;
	  Scanner sc=new Scanner(System.in);
	  public Rectangle()
	  {
	  System.out.println("Enter length and breadth of rectangle=");
	  l=sc.nextFloat();
	  b=sc.nextFloat();
	  }
	  void area()
	  {
		  double a=l*b;
		  System.out.println("area of rectangle="+a);
	  }
  }
  class Circle
  {   
      float r;
	   Scanner sc=new Scanner(System.in);
	  public Circle()
	  {
		  System.out.println("Enter radious of circle=");
		  r=sc.nextFloat();
	  }
	  void area()
	  {
		  double a=3.14*r*r;
		  System.out.println("area of circle="+a);
	  }
  }
  class Triangle
  {    
      float b,h;
	  Scanner sc=new Scanner(System.in);
	  public Triangle()
	  {
		  System.out.println("Enter base and height of traingle=");
		  b=sc.nextFloat();
		  h=sc.nextFloat();
	  }
	  void area()
	  {
		  double a=b*h*1/2;
		  System.out.println("area of triangle="+a);
	  }
  }
  class Area
  {
	  public static void main(String args[])
	  {
		  Rectangle r=new Rectangle();
		  r.area();
		  Circle c=new Circle();
		  c.area();
		  Triangle t=new Triangle();
		  t.area();
	  }
  }
  
	  
		  
  
	  
	  