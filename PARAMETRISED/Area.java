import java.io.*;
import java.util.*;
class Rectangle
{
       	float l,b;
	       Rectangle(float ln,float br)
	        {
	        	l=ln;
		        b=br;
	        }
	      void area()
		  {
			  double a=l*b;
			  System.out.println("Area of rectangle="+a);
		  }
}
class Circle
{
	   float r;
	      Circle(float rn)
		  {
			  r=rn;
		  }
		  void area()
		  {
			  double a=3.14*r*r;
			  System.out.println("Area of circle="+a);
		  }
}
class Traingle
{
	   float b,h;
	     Traingle(float bt,float ht)
		 {
			 b=bt;
			 h=ht;
		 }
		 void area()
		 {
			 double a=b*h*0.5;
			 System.out.println("Area of traingle="+a);
		 }
}

class Area
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float ln,br;
		System.out.println("Enter lenth and breadth of rectangle=");
		ln=sc.nextFloat();
		br=sc.nextFloat();
		Rectangle r=new Rectangle(ln,br);
		r.area();
		float bt,ht;
		System.out.println("Enter base and height of traingle=");
		bt=sc.nextFloat();
		ht=sc.nextFloat();
		Traingle t=new Traingle(bt,ht);
		t.area();
		float rn;
		System.out.println("Enter radious of circle=");
		rn=sc.nextFloat();
		Circle c=new Circle(rn);
		c.area();
	}
}

		
	