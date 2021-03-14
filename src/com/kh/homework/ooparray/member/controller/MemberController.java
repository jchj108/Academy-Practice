package com.kh.homework.ooparray.member.controller;

import com.kh.homework.ooparray.member.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];

	public int existMemberNum() {

		int count = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				count++;
			}
		}
		return count;

	}

	public boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getId().equals(inputId)) {
					return false;
				}
			}
		}
		return true;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				index = i;
				break;
			}
		}
		m[index] = new Member(id, name, password, email, gender, age);

	}

	public String searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getId().equals(id)) {
					return m[i].inform();

				}
			}
		}
		return null;
	}

	public String searchName(String name) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getName().equals(name)) {
					return m[i].inform();
				}
			}
		}
		return null;
	}

	public String searchEmail(String email) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getName().equals(email)) {
					return m[i].inform();
				}
			}
		}
		return null;
	}

	public boolean updatePassword(String id, String password) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getId().equals(id)) {
					m[i].setPassword(password);
					return true;
				}
			}
		}
		return false;
	}

	public boolean updateName(String id, String name) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getId().equals(id)) {
					m[i].setName(name);
					return true;
				}
			}
		}
		return false;
	}

	public boolean updageEmail(String id, String email) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getId().equals(id)) {
					m[i].setName(email);
					return true;
				}
			}
		}
		return false;
	}

	public boolean delete(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getId().equals(id)) {
					m[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public void delete() {
		for (int i = 0; i < m.length; i++) {
				m[i] = null;
		}
	}
	
	public Member[] printAll() {
		return m;
	}
}
