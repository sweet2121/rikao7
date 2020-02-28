package com.wrd.rikao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PersonTest {

	public static void main(String[] args) {
		List<BlankCard> l1 = new ArrayList<BlankCard>();
		l1.add(new BlankCard("6223800001", "招商银行"));
		l1.add(new BlankCard("6224800001", "农业银行"));
		Person p1 = new Person("41142219801002531X", "张三丰", l1);
		
		List<BlankCard> l2 = new ArrayList<BlankCard>();
		l2.add(new BlankCard("6223800002", "招商银行"));
		l2.add(new BlankCard("6224800002", "农业银行"));
		l2.add(new BlankCard("6224800001", "民生银行"));
		Person p2 = new Person("41142219801002531X", "李四宝", l2);
		
		List<BlankCard> l3 = new ArrayList<BlankCard>();
		l3.add(new BlankCard("6223800003", "招商银行"));
		l3.add(new BlankCard("6224800003", "农业银行"));
		l3.add(new BlankCard("6224800002", "民生银行"));
		Person p3 = new Person("411412198010025324", "张三丰", l3);
		
		List<BlankCard> l4 = new ArrayList<BlankCard>();
		l4.add(new BlankCard("6223800004", "招商银行"));
		l4.add(new BlankCard("6224800005", "农业银行"));
		l4.add(new BlankCard("6224800002", "民生银行"));
		Person p4 = new Person("411412198010025311", "孙小宝", l4);
		//打印所有用户的名字,并打印出信息（10分）
		System.out.println(p1.getName()+"-"+p2.getName()+"-"+p3.getName()+"-"+p4.getName());
	
		//获得所有用户名字的 list 集合，并打印出信息（10分）
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		for (Person person : list) {
			System.out.println(person.getName());
		}
		
		//获取用户名字是张三丰的用户信息，并打印出信息（10分）
		for (Person person : list) {
			if (person.getName().equals("张三丰")) {
				System.out.println(person);
			}
		}
		
		//获得名字为 “孙小宝” 客户的 银行卡 cards 集合，并答应出信息（10分）
		for (Person person : list) {
			if (person.getName().equals("孙小宝")) {
				for (BlankCard blankCard : person.getCards()) {
					System.out.println(blankCard);
				}
			}
		}
	}

	

}
