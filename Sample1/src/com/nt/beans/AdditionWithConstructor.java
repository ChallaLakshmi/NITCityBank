package com.nt.beans;

public class AdditionWithConstructor {
int x;
int y;
int z=x+y;

public AdditionWithConstructor() {
	System.out.println("It is my first Constructor");
}

public void  main(int x, int y, int z){
	System.out.println("result is "+z);
}
public static void main(String args[]) {
	AdditionWithConstructor adc = new AdditionWithConstructor();
	adc.main(20, 20, 20+20);
	
}

}
