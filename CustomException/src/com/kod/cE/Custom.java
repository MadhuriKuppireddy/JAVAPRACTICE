package com.kod.cE;

class MyException extends Exception{
	public MyException() {
		System.out.println("The time is 10:00 clock please close the mobile");
	}
}
class Custom {
	public static void main(String[] args) throws MyException {
		usingMobile();
	}
	private static void usingMobile() throws MyException {
		int time=0;
		for(;time<=10;time++) {
			System.out.println("Use Mobile");
		}
		if(time >10) {
			throw new MyException();
		}
	}
}
