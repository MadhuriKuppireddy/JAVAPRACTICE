package com.kod.thread;

public class Main {
	public static void main(String[] args) {
		Typing ty = new Typing();
		AutoCorrection ac = new AutoCorrection();
		AutoSuggestion as = new AutoSuggestion();
		ac.setDaemon(true);
		as.setDaemon(true);
		ac.setPriority(1);
		as.setPriority(1);
		ty.start();
		ac.start();
		as.start();
	}
}
