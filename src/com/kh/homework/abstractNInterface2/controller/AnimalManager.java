package com.kh.homework.abstractNInterface2.controller;

import com.kh.homework.abstractNInterface2.model.vo.Animal;
import com.kh.homework.abstractNInterface2.model.vo.Cat;
import com.kh.homework.abstractNInterface2.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] aArray = new Animal[5];
		
		aArray[0] = new Dog("官迪捞", "归备", 20);
		aArray[1] = new Cat("具克捞", "内剪", "何魂", "伙祸");
		aArray[2] = new Cat("货固", "其福矫救", "笼", "闰祸");
		aArray[3] = new Dog("炔备", "柳稻俺", 26);
		aArray[4] = new Dog("港港捞", "府飘府滚", 30);
		
		for(int i = 0; i<aArray.length; i++) {
			aArray[i].speak();
		}
	}
}
