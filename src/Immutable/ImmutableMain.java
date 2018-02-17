package Immutable;

public class ImmutableMain {

	public static void main(String[] args) {
		Immutable immutable = new Immutable(11171, "Chiranjeevi Tapal");
		Immutable immutable1 = new Immutable(11171, "Chiranjeevi Tapal");
		System.out.println(immutable.hashCode());
		System.out.println(immutable.getEmployeeId() + " " + immutable.getEmployeeName());
		System.out.println(immutable1.hashCode());
		System.out.println(immutable1.getEmployeeId() + " " + immutable.getEmployeeName());
	}
}
