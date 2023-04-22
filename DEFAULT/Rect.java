import java.io.*;
import java.util.*;
 class Rectangle
 {
	 private int l,b,a;
	 Scanner sc=new Scanner(System.in);
    public  Rectangle()
	{
		System.out.println("Enter length and bradth=");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void area()
	{
		float a=l*b;
		System.out.println("Area="+a);
	}
 }
 class Rect
 {
	 public static void main(String args[])
	 {
		 Rectangle r=new Rectangle();
		 r.area();
	 }
 }
 