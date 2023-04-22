import java.io.*;
import java.util.*;
  class Value
  {  
      Scanner sc=new Scanner(System.in);
	  int a,b;
	  Value()
	  {
		  System.out.println("Enter two nos=");
		  a=sc.nextInt();
		  b=sc.nextInt();
	  }
	  void swapp()
	  {
		  System.out.println("befor swapping first value="+a+"\tsecond value="+b);
		  int z=a;
		      a=b;
			  b=z;
			  System.out.println("after swapping first value="+a+"\tsecond value="+b);
	  }
  }
  class Swapp
  {
	  public static void main(String args[])
	  {
		  Value v=new Value();
		  v.swapp();
	  }
  }
  
	  
		  