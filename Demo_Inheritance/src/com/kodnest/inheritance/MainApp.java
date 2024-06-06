package com.kodnest.inheritance;

public class MainApp {
	public static void main(String[] args) {
		TrainerBot tBot = new TrainerBot();
		tBot.teaching();
		tBot.read();
		tBot.write();
		StudentBot sBot = new StudentBot();
		sBot.applySkillsSet();
		sBot.read();
		sBot.write();
	}
}
