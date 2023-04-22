import java.io.*;
import java.util.*;
   class Rect
   {    
       private int l,b;
	   Rect(int ln,int br)
	   {
		   l=ln;
		   b=br;
	   }
	   void area()
	   {
		   float a=l*b;
		   System.out.println("Area of rectangle="+a);
	   }
   }
   class Rectangle
   {
	   public static void main(String args[])
	   {
		   int x,y;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter length and breadth of reactangle=");
		   x=sc.nextInt();
		   y=sc.nextInt();
		   Rect r=new Rect(x,y);
		   r.area();
	   }
   }
   
	   
		   
	   