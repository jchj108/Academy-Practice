package com.kh.homework.abstractNInterface2.controller;

import com.kh.homework.abstractNInterface2.model.vo.Animal;
import com.kh.homework.abstractNInterface2.model.vo.Cat;
import com.kh.homework.abstractNInterface2.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] aArray = new Animal[5];
		
		Dog d = new Dog("3", "3", 3);
		
		aArray[0] = new Dog("�ٵ���", "�鱸", 20);
		aArray[1] = new Cat("�߿���", "�ڼ�", "�λ�", "���");
		aArray[2] = new Cat("����", "�丣�þ�", "��", "���");
		aArray[3] = new Dog("Ȳ��", "������", 26);
		aArray[4] = d;
		
		for(int i = 0; i<aArray.length; i++) {
			aArray[i].speak();
		}
	}
}
