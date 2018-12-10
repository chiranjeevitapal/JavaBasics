package Immutable;

public final class MyImmutableClass {
	private final String parameter;

	public String getParameter() {
		return this.parameter;
	}

	MyImmutableClass(String parameter) {
		this.parameter = parameter;
	}
}
