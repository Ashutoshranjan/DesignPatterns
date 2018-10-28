package org.designpatterns.singleton;

public class SingletonPattern {

	private static SingletonPattern obj;
	private SingletonPattern() {
		
	}
	
	
	public static SingletonPattern instanceOf() {
		
		if(obj == null) {
			obj = new SingletonPattern();
		}
		
			return obj;
	}
	
}
