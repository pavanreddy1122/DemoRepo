package com.fff;

import java.util.Scanner;

public class Practies {

	    public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  int B=scan.nextInt();
	  int H=scan.nextInt();
	  try
	  {
	  if(B>=0&&H>=0)
	  {
	      System.out.println(B*H);
	  }
	 
	  }
	  catch(Exception e)
	  {
	      System.out.println(e+"Breadth and height must be positive");
	  }
	  scan.close();
	}

}
