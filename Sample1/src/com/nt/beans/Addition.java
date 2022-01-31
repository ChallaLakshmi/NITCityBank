package com.nt.beans;

public class Addition {
    int a;
	 int b;
	 int c=a+b;
	public Addition(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	
	}
		public static void main(String args[]) {
			Addition ad = new Addition(10,20,10+20);
			
		}
		}
	


