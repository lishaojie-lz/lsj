package com.lsj;

public class BlankCard {
	String cardId;
	String cardName;
	public BlankCard() {
		super();
	}
	
	public BlankCard(String cardId, String cardName) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
	}

	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	@Override
	public String toString() {
		return "BlankCard [身份证号=" + cardId + ", 姓名=" + cardName + "]";
	}
	
}
