package com.ssi;

public class ClientJava {
public static void main(String args[]){
	
	ATMMachine machine=new ATMMachine();
	SBICard card1=new SBICard(12345);
	HDFCCard card2=new HDFCCard(67890);
	//machine.setCard(card1);
	machine.setCard(card2);
	machine.doWithdraw();
	machine.doBalanceEnquiry();
	
}
}
