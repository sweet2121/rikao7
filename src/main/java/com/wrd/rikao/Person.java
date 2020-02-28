package com.wrd.rikao;

import java.util.List;

public class Person {

	private String id;
	
	private String name;
	
	private List<BlankCard> cards;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BlankCard> getCards() {
		return cards;
	}

	public void setCards(List<BlankCard> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cards=" + cards + "]";
	}

	public Person(String id, String name, List<BlankCard> cards) {
		super();
		this.id = id;
		this.name = name;
		this.cards = cards;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
