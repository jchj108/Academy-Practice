package com.kh.homework.abstractNInterface2.controller;

import com.kh.homework.abstractNInterface2.model.vo.Animal;
import com.kh.homework.abstractNInterface2.model.vo.Cat;
import com.kh.homework.abstractNInterface2.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] aArray = new Animal[5];
		
		Dog d = new Dog("3", "3", 3);
		
		aArray[0] = new Dog("바둑이", "백구", 20);
		aArray[1] = new Cat("야옹이", "코숏", "부산", "삼색");
		aArray[2] = new Cat("새미", "페르시안", "집", "흰색");
		aArray[3] = new Dog("황구", "진돗개", 26);
		aArray[4] = d;
		
		for(int i = 0; i<aArray.length; i++) {
			aArray[i].speak();
		}
	}
}
