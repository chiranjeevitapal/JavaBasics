package Immutable;

public class MyImmutableMainClass {

	public static void main(String[] args) {
		MyImmutableClass myImClass1 = new MyImmutableClass("hello");
		MyImmutableClass myImClass2 = new MyImmutableClass("hello");
		System.out.println(myImClass1.hashCode());
		System.out.println(myImClass2.hashCode());
	}

}
