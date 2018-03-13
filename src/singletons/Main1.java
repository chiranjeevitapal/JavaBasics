package singletons;

public class Main1 {
	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE1;
		System.out.println(singleton.hashCode());
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}
}
