package ch_06.sec15;

public class Singleton {
	private static Singleton singletion = new Singleton();
	private Singleton() {
	}
	public static Singleton getInstance() {
		return singletion;
	}
}
