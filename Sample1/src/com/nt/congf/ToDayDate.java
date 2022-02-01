package com.nt.congf;

import java.util.Date;

public class ToDayDate {
	public Date getTodayDate() {
		return new Date();
		
	}
	
	public static void main(String args[]) {
		ToDayDate tdd = new ToDayDate();
		System.out.println(tdd.getTodayDate());
	}

}
