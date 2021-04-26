package com.kh.homework.API.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.homework.API.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
		Calendar c = new GregorianCalendar();
		int year = c.get(Calendar.YEAR);
		
		LeapController lc = new LeapController();
		boolean leap = lc.isLeapYear(year);
		
		if(leap) {
			System.out.println(Calendar.YEAR + "���� �����Դϴ�.");
		} else {
			System.out.println(Calendar.YEAR + "���� ����Դϴ�.");
		}
		
		System.out.println("�� ��¥ �� : " + lc.leapDate(c));
		
	}
	
}
