package com.kh.homework.abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {

	public V40() {
		super.setMaker("LG");
	}
	
	@Override
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}

	@Override
	public String takeCall() {
		return "��ȭ�ޱ� ��ư�� ����";
	}
	
	public String picture() {
		return "1200��, 1600�� ȭ�� Ʈ���� ī�޶�";
	}
	
	public String charge() {
		return "���� ����, ���� ���� ����";
	}
	
	@Override
	public String touch() {
		return "������";
	}

	@Override
	public boolean bluetoothPen() {
		return false;
	}

	@Override
	public String printInformation() {
		return "V40�� " + getMaker() + "���� ��������� ������ ������ ����\n" + makeCall() + "\n" + takeCall() + "\n" + picture() + "\n" + charge() + "\n"  + touch() + "\n" + "�������� �� ž�� ���� : " + bluetoothPen();
	}

	
	
	
}