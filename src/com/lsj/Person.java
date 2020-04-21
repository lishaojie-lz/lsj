package com.lsj;

import java.util.List;

public class Person {

	Integer id;
	String name;
	BlankCard cards;
	public Person() {
		super();
	}
	public Person(Integer id, String name, BlankCard b1) {
		super();
		this.id = id;
		this.name = name;
		this.cards = b1;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BlankCard getCards() {
		return cards;
	}
	public void setCards(BlankCard cards) {
		this.cards = cards;
	}
	@Override
	public String toString() {
		return "Person [¿¨ ºÅ=" + id + ", ¿¨Ãû³Æ=" + name + ", ¿¨" + cards + "]";
	}
	
}
