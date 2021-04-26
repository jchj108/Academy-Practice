package com.kh.homework.API.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	Calendar c = new GregorianCalendar();

	public boolean isLeapYear(int year) {

		if (c.get(Calendar.YEAR) % 4 == 0 && (c.get(Calendar.YEAR) % 100 != 0 || c.get(Calendar.YEAR) % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public long leapDate(Calendar c) {

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);

		long current = 0l;

		for (int i = 0; i < year; i++) {
			if (isLeapYear(i)) {
				current = 366 * year;
			} else {
				current = 365 * year;
			}
		}

		if (isLeapYear(year)) {
			for (int i = 0; i < month; i++) {
				switch (i) {
				case 2:
					current += 29;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					current += 30;
					break;
				default:
					current += 31;
				}
			}
		} else {
			for (int i = 0; i < month; i++) {
				switch (i) {
				case 2:
					current += 28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					current += 30;
					break;
				default:
					current += 31;
				}
			}
		}
		
		current += date;
		
		return current;
	}
}
