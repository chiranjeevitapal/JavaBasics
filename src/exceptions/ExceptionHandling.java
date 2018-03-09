package exceptions;

import java.io.IOException;

public class ExceptionHandling {
	public void method() throws Exception{
		System.out.println("parent method");
	}
}

class ExceptionHandlingChild extends ExceptionHandling {
	public void method() {
		System.out.println("child method");
	}
}

