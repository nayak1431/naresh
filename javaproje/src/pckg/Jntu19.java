package pckg;

public class Jntu19 extends Jntu18 {
	int i=20;
	void add(){
		int a;
		int b;
		int t;
		a=200;
		b=150;
		t=a+b;
		System.out.println(t+this.i);
		System.out.println(t+super.i);
		
		
	}
	void display(){
		this.add();
		super.add();
	
		
	}

}
