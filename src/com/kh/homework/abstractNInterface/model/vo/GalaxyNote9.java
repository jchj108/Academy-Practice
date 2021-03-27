package com.kh.homework.abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	
	
	public GalaxyNote9() {
		super.setMaker("삼성");
	}
	
	
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	
	public String picture() {
		return "1200만 듀얼 카메라";
	}
	
	@Override
	public String touch() {
		return "정전식, 와콤펜 지원";
	}

	@Override
	public String printInformation() {
		return "갤럭시 노트 9는 " + getMaker() + "에서 만들어졌고 제원은 다음과 같다" + "\n" + makeCall() + "\n" + takeCall() +"\n" + picture() +"\n" + charge() +"\n" + "블루투스 펜 탑재 여부 : " + bluetoothPen();
	}

	@Override
	public boolean bluetoothPen() {
		return true;
	}

}
