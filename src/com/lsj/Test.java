package com.lsj;

public class Test {

	public static void main(String[] args) {
		
		BlankCard b1 = new BlankCard("4343424223232323","������");
		BlankCard b2 = new BlankCard("4343424223232323","����");
		
		for (int i = 1; i < 100; i++) {
			System.out.println(new Person(i, "��������", b1));
			System.out.println(new Person(i, "��������", b2));
		}
	}
}
