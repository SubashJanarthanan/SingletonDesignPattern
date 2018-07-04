package com.subash.designpatterns;

/**
 * The Class MainClass.
 * 
 * @author subash
 * 
 */
public class MainClass {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		SingletonPattern instance = SingletonPattern.getInstance();
		instance.executeMethodOne();
		instance.executeMethodTwo();
	}

}
