package com.ssi;

public class HDFCCard implements ATMCard {
	
private int accountNumber;
	
	public HDFCCard(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void withdraw() {
		System.out.println("Withdrawl From HDFCCard Ano : "+accountNumber);
	}

	public void balanceEnquiry() {
		System.out.println("BalanceEnquiry From HDFCCard Ano : "+accountNumber);		
	}

}
