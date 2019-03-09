package com.ssi;

public class ATMMachine {

	ATMCard card;
	
	
	
	public ATMMachine() {
		super();
	}



	public ATMMachine(ATMCard card) {
		super();
		this.card = card;
	}



	public ATMCard getCard() {
		return card;
	}



	public void setCard(ATMCard card) {
		this.card = card;
	}



	public void doWithdraw(){
		if(card!=null){
		card.withdraw();
		}else{
			System.out.println("Please Insert Card");
		}
	}
	
	public void doBalanceEnquiry(){
		if(card!=null){
		card.balanceEnquiry();
		}else{
			System.out.println("Please Insert Card");
		}
	}
	
	
}
