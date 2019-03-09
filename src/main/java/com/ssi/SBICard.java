package com.ssi;

public class SBICard implements ATMCard {

	private int accountNumber;
	
	public SBICard(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public void withdraw() {
		System.out.println("Withdrawl From SBICard Ano : "+accountNumber);
	}

	public void balanceEnquiry() {
		System.out.println("BalanceEnquiry From SBICard Ano : "+accountNumber);		
	}

}
