package com.kh.homework.abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	
	
	public GalaxyNote9() {
		super.setMaker("�Ｚ");
	}
	
	
	public String charge() {
		return "��� ����, ��� ���� ����";
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
		return "1200�� ��� ī�޶�";
	}
	
	@Override
	public String touch() {
		return "������, ������ ����";
	}

	@Override
	public String printInformation() {
		return "������ ��Ʈ 9�� " + getMaker() + "���� ��������� ������ ������ ����" + "\n" + makeCall() + "\n" + takeCall() +"\n" + picture() +"\n" + charge() +"\n" + "������� �� ž�� ���� : " + bluetoothPen();
	}

	@Override
	public boolean bluetoothPen() {
		return true;
	}

}
