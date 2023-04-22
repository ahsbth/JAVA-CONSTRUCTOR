import java.io.*;
import java.util.*;
  class Value
  {  
     
	  int p,q;
	  Value(int a,int b)
	  {
		 p=a;
		 q=b;
		 
	  }
	  void swapp()
	  {
		  System.out.println("befor swapping first value="+p+"\tsecond value="+q);
		  int z=p;
		      p=q;
			  q=z;
			  System.out.println("after swapping first value="+p+"\tsecond value="+p);
	  }
  }
  class Swapp
  {
	  public static void main(String args[])
	  { 
	    int a,b;
		   Scanner sc=new Scanner(System.in);
		    System.out.println("Enter two nos=");
			 a=sc.nextInt();
		     b=sc.nextInt();  
		  Value v=new Value(a,b);
		  v.swapp();
	  }
  }
  
	  
		  