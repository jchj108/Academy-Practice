package com.kh.homework.API.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Tmp {

	public static void main(String[] args) {

		Calendar c = new GregorianCalendar();
		
		
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		
		System.out.println(month);
		System.out.println(date);
	}
}
