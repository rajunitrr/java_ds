package com.ashokit.java8;

interface Greeting {

	void wish();
}

interface Calc{
	int  add(int i,int j);

}

interface S{
	int g(String s);
}

public class WellWisher {

	public static void wish(Greeting gr) {
		gr.wish();
	}

	public static void main(String[] args) throws InterruptedException {

		wish(() -> {System.out.println("Hello ");}
		);		
		
		
		Calc sum=(a,b)->{return a+b;};
		//Calc sum=(a,b)->{return a+b;};
		
		int result=sum.add(10, 20);
		System.out.println("Sum is "+result);
		
		//S s1=s->{return s.length();};
		S s1=s->s.length();
		System.out.println(s1.g("raju"));
		
	}

}
