package com.kod.cE;

class Bank {
	void debit(int bal) throws InsuffiencientBalanceException {
		System.out.println(bal);
		if(bal<=0) {
			throw new InsuffiencientBalanceException();
		}
	}
}
class InsuffiencientBalanceException extends Exception {
	public  InsuffiencientBalanceException() {
		System.out.println("Insuffiencient balance,try lesser amount next time");
	}
}
public class Main {
	public static void main(String[] args) throws Exception  {
		int bal=1500;
		new Bank().debit(bal);
		bal=bal-490;
		new Bank().debit(bal);
		bal=bal-490;
		new Bank().debit(bal);
		bal=bal-490;
		new Bank().debit(bal);
		bal=bal-490;
		new Bank().debit(bal);
	
	}
}
