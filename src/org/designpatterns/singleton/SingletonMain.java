package org.designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SingletonPattern sp1 = SingletonPattern.instanceOf();
		System.out.println(sp1);
		SingletonPattern sp2 = SingletonPattern.instanceOf();
		System.out.println(sp2);
		SingletonPattern sp3 = SingletonPattern.instanceOf();
		System.out.println(sp3);
		
		
	}

}
