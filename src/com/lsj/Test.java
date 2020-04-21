package com.lsj;

public class Test {

	public static void main(String[] args) {
		
		BlankCard b1 = new BlankCard("4343424223232323","张三丰");
		BlankCard b2 = new BlankCard("4343424223232323","张三");
		
		for (int i = 1; i < 100; i++) {
			System.out.println(new Person(i, "招商银行", b1));
			System.out.println(new Person(i, "招商银行", b2));
		}
	}
}
