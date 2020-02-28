package com.wrd.rikao;

public class BlankCard {

	private String BlankCard;
	
	private String cardName;

	public String getBlankCard() {
		return BlankCard;
	}

	public void setBlankCard(String blankCard) {
		BlankCard = blankCard;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	@Override
	public String toString() {
		return "BlankCard [BlankCard=" + BlankCard + ", cardName=" + cardName + "]";
	}

	public BlankCard(String blankCard, String cardName) {
		super();
		BlankCard = blankCard;
		this.cardName = cardName;
	}

	public BlankCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
