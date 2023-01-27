package com.fff;

@FunctionalInterface
public interface Function {

	int add();
	 String toString();
	
	boolean equals(Object obj);
	
	
	
}
interface Function1 {
	
	int add();
	
}
class Test implements Function,Function1
{
	public void sub()
	{
		
		System.out.println("welcome1");
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
class main
{
	public static void main(String args[])
	{
		Test t=new Test();
		
		t.sub();
	}
}
