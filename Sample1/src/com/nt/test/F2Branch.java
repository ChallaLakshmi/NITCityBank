package com.nt.test;

public class F2Branch {
	int a,b,c;
	int result = a+b+c;
	public F2Branch(int a, int b, int c) {
		this.a = a;
		this.b = a;
		this.c = a;
		this.result=a+b+c;
		System.out.println("result of Three No : "+result);
	
		
	}

	public static void main(String[] args) {
		F2Branch fb = new F2Branch(10,20,30);
		System.out.println(fb.result);
		// TODO Auto-generated method stub

	}

}
