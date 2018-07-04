package com.subash.designpatterns;

/**
 * The Class SingletonPattern.
 * 
 * @author subash
 * 
 */
public class SingletonPattern {
	
	/** The instance. */
	private static SingletonPattern instance = null;
	
	/**
	 * Instantiates a new singleton pattern.
	 */
	private SingletonPattern() {
		
	}
	
	/**
	 * Gets the single instance of SingletonPattern.
	 *
	 * @return single instance of SingletonPattern
	 */
	public static SingletonPattern getInstance() {
		if(instance == null) {
			instance = new SingletonPattern();
		}
		return instance;
	}
	
	/**
	 * Execute method one.
	 */
	public void executeMethodOne() {
		System.out.println("SingletonPattern.executeMethodOne()");
	}
	
	/**
	 * Execute method two.
	 */
	public void executeMethodTwo() {
		System.out.println("SingletonPattern.executeMethodTwo()");
	}

}
