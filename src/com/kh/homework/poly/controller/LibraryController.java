package com.kh.homework.poly.controller;

import com.kh.homework.poly.model.vo.AniBook;
import com.kh.homework.poly.model.vo.Book;
import com.kh.homework.poly.model.vo.CookBook;
import com.kh.homework.poly.model.vo.Member;

public class LibraryController {

	private Member mem = null;
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() {
		return mem;
	}

	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keyword) {
		Book[] tmp = new Book[bList.length];

		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				tmp[count++] = bList[i];
				// i�� ������ �� ������ �þ���� count�� if���� ��ġ�� ���� �þ��
			}
		}
		return tmp;
	}

	public int rentBook(int index) {
		int result = 0;
		if (bList[index] instanceof AniBook) {
			if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
				result = -1;
			}
		}
		if (bList[index] instanceof CookBook) {
			if (((CookBook) bList[index]).isCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount()+1);
//				smem.setCouponCount(couponCount);
				result = 2;
			}
		}
		return result;
	}
}
